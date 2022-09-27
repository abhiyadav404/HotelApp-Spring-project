package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.hotelapp.models.Address;
import com.hotelapp.models.Delivery;
import com.hotelapp.models.Hotel;
import com.hotelapp.models.Menu;
import com.hotelapp.service.DeliveryService;
import com.hotelapp.service.HotelService;
import com.hotelapp.service.MenuService;

@SpringBootApplication
public class SpringHotelappRestapiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelappRestapiApplication.class, args);
	}
    @Autowired
    HotelService hotelService;
    @Autowired
    DeliveryService deliveryService;
    @Autowired
    MenuService menuService;
	@Override
	public void run(String... args) throws Exception{
//		Address address = new Address("JP Nagar","Banglore",537890,"KAR");
//		
//		Menu menu1 = new Menu("Idli",20);
//		Menu menu2 = new Menu("Dosa",20);
//		Set<Menu> menuList =new HashSet<>(Arrays.asList(menu1,menu2));
//		
//		Delivery del1=deliveryService.getdeliveryByPartner("uber");
//		Set<Delivery> deliveryList =new HashSet<>(Arrays.asList(del1));
//		
//		Hotel hotel = new Hotel("The Santosh",address,menuList,deliveryList);
//		hotelService.addHotel(hotel);
		
		
//		hotelService.getHotelsByCity("Banglore")
//		.stream()
//		.forEach((h)->System.out.println(h.getHotelName()+h.getAddress().getCity()));
//		System.out.println();
//		
//		hotelService.getHotelsByLocation("JP Nagar")
//		.stream()
//		.forEach((h)->System.out.println(h.getHotelName()+h.getMenuList()));
		
//		hotelService.getHotelsByMenu("Idli")
//	            	.stream()
//		            .forEach((h)->System.out.println(h.getHotelName()+h.getAddress().getStreetName()));
//		
//		System.out.println();
//		
//		hotelService.getHotelsByDelivery("Swiggy")
//    	.stream()
//        .forEach((h)->System.out.println(h.getHotelName()+h.getAddress().getStreetName()));
//		hotelService.getHotelsByLocationAndMenu("JP Nagar", "Idli")
//		            .forEach((h)->System.out.println(h.getHotelName()+h.getAddress().getCity()));
		
		
//		menuService.getMenusByHotel("A2B")
//		           .forEach((m)->System.out.println(m.getMenuName()+" "+m.getPrice()));
	}

}
