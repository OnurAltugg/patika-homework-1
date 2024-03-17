package com.patika.model;

public class Villa extends Residence {

	public Villa() {
		super();
	}

	public Villa(double price, double squareMeter, String roomCount) {
		super(price, squareMeter, roomCount);
	}

	@Override
	public String toString() {
		return "Villa: " + "Price -> " + getPrice() + " Square meter -> " + getSquareMeter() 
		+ " Room count -> " + getRoomCount();
	}

}
