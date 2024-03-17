package com.patika.model;

public class SummerHouse extends Residence {

	public SummerHouse() {
		super();
	}

	public SummerHouse(double price, double squareMeter, String roomCount) {
		super(price, squareMeter, roomCount);
	}

	@Override
	public String toString() {
		return "Summer House: " + "Price -> " + getPrice() + " Square meter -> " + getSquareMeter() 
		+ " Room count -> " + getRoomCount();
	}
	
}