package com.patika.model;

public abstract class Residence {
	
	private double price;
	private double squareMeter;
	private String roomCount;
	
	public Residence() {}
	
	public Residence(double price, double squareMeter, String roomCount) {
		this.price = price;
		this.squareMeter = squareMeter;
		this.roomCount = roomCount;
	}
	
	public abstract String toString();

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSquareMeter() {
		return squareMeter;
	}

	public void setSquareMeter(double squareMeter) {
		this.squareMeter = squareMeter;
	}

	public String getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(String roomCount) {
		this.roomCount = roomCount;
	}
	
}
