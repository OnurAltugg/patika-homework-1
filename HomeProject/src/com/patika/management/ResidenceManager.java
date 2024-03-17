package com.patika.management;

import java.util.ArrayList;
import java.util.List;

import com.patika.model.House;
import com.patika.model.Residence;
import com.patika.model.SummerHouse;
import com.patika.model.Villa;

public class ResidenceManager {
	
	private static ResidenceManager manager;
	
	private ResidenceManager() {}
	
	public static ResidenceManager getResidenceManager() {
		if(manager == null) {
			manager = new ResidenceManager();
		}
		return manager;
	}
	
	public List<Residence> getHouseList() {
        List<Residence> houseList = new ArrayList<>();
        houseList.add(new House(920000.0, 120.5, "3+1"));
        houseList.add(new House(820000.0, 140.7, "2+1"));
        houseList.add(new House(720000.0, 110.3, "3+1"));
        return houseList;
    }

    public List<Residence> getVillaList() {
        List<Residence> villaList = new ArrayList<>();
        villaList.add(new Villa(1000000.0, 200, "5+2"));
        villaList.add(new Villa(2000000.0, 180, "6+2"));
        villaList.add(new Villa(3000000.0, 230, "6+2"));
        return villaList;
    }

    public List<Residence> getSummerHouseList() {
        List<Residence> summerHouseList = new ArrayList<>();
        summerHouseList.add(new SummerHouse(1120000.0, 260, "5+2"));
        summerHouseList.add(new SummerHouse(1320000.0, 300, "8+2"));
        summerHouseList.add(new SummerHouse(1024200.0, 240, "6+2"));
        return summerHouseList;
    }

}
