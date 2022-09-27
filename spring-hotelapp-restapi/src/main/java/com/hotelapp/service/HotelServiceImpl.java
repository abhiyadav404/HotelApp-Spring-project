package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.exception.HotelNotFoundException;
import com.hotelapp.exception.IdNotFoundException;
import com.hotelapp.models.Hotel;
import com.hotelapp.repository.HotelRepository;
@Service
public class HotelServiceImpl implements HotelService {
     
	@Autowired
	HotelRepository hotelrepository;
	@Override
	public Hotel addHotel(Hotel hotel) {
		return hotelrepository.save(hotel);
	}

	@Override
	public void updateHotel(Hotel hotel) {
		hotelrepository.save(hotel);

	}

	@Override
	public Hotel getHotelById(int hotelId) {
		
		return hotelrepository.findById(hotelId)
				               .orElseThrow(()->new IdNotFoundException("Id not Found"));
	}

	@Override
	public void deleteHotel(int hotelById) {
		hotelrepository.deleteById(hotelById);
	}

	@Override
	public List<Hotel> getHotelsByCity(String city) {
		
		List<Hotel>hotelList = hotelrepository.findByAddressCity(city);
		if(hotelList.isEmpty())throw new HotelNotFoundException("Hotels with city name not found");
		return hotelList;
	}

	@Override
	public List<Hotel> getHotelsByMenu(String menuName) {
		List<Hotel>hotelList =hotelrepository.getHotelsByMenu(menuName);
		if(hotelList.isEmpty())throw new HotelNotFoundException("Hotels with menu not found");
		return hotelList;
	}

	@Override
	public List<Hotel> getHotelsByDelivery(String partnerName) {
		List<Hotel>hotelList =hotelrepository.getHotelsByDelivery(partnerName);
		if(hotelList.isEmpty())throw new HotelNotFoundException("Hotels with delivery not found");
		return hotelList;
	}

	@Override
	public List<Hotel> getHotelsByLocation(String location) {
		List<Hotel>hotelList =hotelrepository.findByAddressStreetName(location);
		if(hotelList.isEmpty())throw new HotelNotFoundException("Hotels with location not found");
		return hotelList;
	}

	@Override
	public List<Hotel> getHotelsByLocationAndMenu(String location, String menuName) {
		
		List<Hotel>hotelList = hotelrepository.getHotelsByLocationAndMenu(location, menuName);
		if(hotelList.isEmpty())throw new HotelNotFoundException("Hotels with location and menu not found");
		return hotelList;
	}

}
