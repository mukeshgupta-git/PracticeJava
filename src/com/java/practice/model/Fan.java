package com.java.practice.model;

public class Fan {

	private int bladeCount;
	private String bladeMaterial;
	private String companyName;
	private int rpm;
	private int rodeLangth;
	private String binding;
	private String fanTypes;
	private int price;

	public int getPrice(int ironCost, int bindingRate) {
		int price = ironCost * 4 + 50 * 2 + 100 + 500;
		return price;
	}
	
	public int getPrice(int ironCost) {
		int price = ironCost * 4 + 50 * 2 + 100 + 500;
		return price;
	}
	
	

}
