package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.models.Menu;
import com.hotelapp.repository.MenuRepository;
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuRepository menurepository;
	@Override
	public List<Menu> getMenusByHotel(String hotelName) {
		
	//	return menurepository.findByHotelHotelName(hotelName);
		return menurepository.findByHotel(hotelName);
	}

}
