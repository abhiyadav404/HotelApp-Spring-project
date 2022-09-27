package com.hotelapp.service;

import java.util.List;

import com.hotelapp.exception.HotelNotFoundException;
import com.hotelapp.exception.IdNotFoundException;
import com.hotelapp.models.Hotel;

public interface HotelService {
    
	Hotel addHotel(Hotel hotel) throws IdNotFoundException;
	void updateHotel(Hotel hotel) throws IdNotFoundException;
	Hotel getHotelById(int hotelId) throws IdNotFoundException;
	void deleteHotel(int hotelById) throws IdNotFoundException;
	
	List<Hotel>getHotelsByCity(String city) throws HotelNotFoundException;
	List<Hotel>getHotelsByMenu(String menuName) throws HotelNotFoundException;
	List<Hotel>getHotelsByDelivery(String partnerName) throws HotelNotFoundException;
	List<Hotel>getHotelsByLocation(String location) throws HotelNotFoundException;
	List<Hotel>getHotelsByLocationAndMenu(String location,String menuName) throws HotelNotFoundException;
}
