package com.patika.service;

import java.util.List;

import com.patika.model.House;
import com.patika.model.Residence;
import com.patika.model.SummerHouse;
import com.patika.model.Villa;

public class ResidenceService {
	
	public static double getTotalPrice(List<Residence> listOfResidences) {
		double totalPrice = 0;
		for (Residence residence : listOfResidences) {
			totalPrice += residence.getPrice();
		}
		return totalPrice;
	}
	
	public static double getAvgSquareMeter(List<Residence> listOfResidences) {
		double totalSquareMeter = 0;
		for (Residence residence : listOfResidences) {
			totalSquareMeter += residence.getSquareMeter();
		}
		return totalSquareMeter / listOfResidences.size();
	}
	
	public static void filterHousesByRooms(String roomCount, List<Residence> listOfResidences) {
		for (Residence residence : listOfResidences) {
			if(residence.getRoomCount().equals(roomCount)) {
				System.out.println(residence);
			}
		}
	}

	
}
