package com.patika.model;

public class House extends Residence {

	public House() {
		super();
	}

	public House(double price, double squareMeter, String roomCount) {
		super(price, squareMeter, roomCount);
	}

	@Override
	public String toString() {
		return "House: " + "Price -> " + getPrice() + " Square meter -> " + getSquareMeter() 
		+ " Room count -> " + getRoomCount();
	}
	
}