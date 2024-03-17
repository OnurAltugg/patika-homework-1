package com.patika;

import java.util.ArrayList;
import java.util.List;

import com.patika.management.ResidenceManager;
import com.patika.model.Residence;
import com.patika.service.ResidenceService;

public class Main {

	public static void main(String[] args) {
		ResidenceManager manager = ResidenceManager.getResidenceManager();
		
		List<Residence> housesList = manager.getHouseList();
		List<Residence> summerHousesList = manager.getSummerHouseList();
		List<Residence> villasList = manager.getVillaList();
		
		List<Residence> allResidences = new ArrayList<>();
		allResidences.addAll(housesList);
		allResidences.addAll(summerHousesList);
		allResidences.addAll(villasList);
		
		System.out.println("Total price of houses: " + ResidenceService.getTotalPrice(housesList));
        System.out.println("Total price of villas: " + ResidenceService.getTotalPrice(villasList));
        System.out.println("Total price of summer houses: " + ResidenceService.getTotalPrice(summerHousesList));
        System.out.println("Total price of all residences: " + ResidenceService.getTotalPrice(allResidences));
        System.out.println("Average square meters of houses: " + ResidenceService.getAvgSquareMeter(housesList));
        System.out.println("Average square meters of villas: " + ResidenceService.getAvgSquareMeter(villasList));
        System.out.println("Average square meters of summer houses: " + ResidenceService.getAvgSquareMeter(summerHousesList));
        System.out.println("Average square meters of all residences: " + ResidenceService.getAvgSquareMeter(allResidences));
        System.out.println("Residences according to the number of rooms: ");
        ResidenceService.filterHousesByRooms("6+2", allResidences);
	}

}
