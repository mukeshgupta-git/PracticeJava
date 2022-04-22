package com.java.practice.objects;

import java.util.Date;

public class Delivery {

	String fromAddress;
	String toAddress;
	int packageWeight;
	int price;
	String paymentMethod;
	String courierCompanyName;
	Date lastDeliveryDate;
	String assigneeName;
	long assigneeMob;
	String packagingMaterial;
	
	public Delivery(String fromAddress, String toAddress, int packageWeight, int price, String paymentMethod,
			String courierCompanyName, Date lastDeliveryDate, String assigneeName, long assigneeMob,
			String packagingMaterial) {
		super();
		this.fromAddress = fromAddress;
		this.toAddress = toAddress;
		this.packageWeight = packageWeight;
		this.price = price;
		this.paymentMethod = paymentMethod;
		this.courierCompanyName = courierCompanyName;
		this.lastDeliveryDate = lastDeliveryDate;
		this.assigneeName = assigneeName;
		this.assigneeMob = assigneeMob;
		this.packagingMaterial = packagingMaterial;
	}

	public Delivery(String abc) {
		System.out.println("Inside Delivery constructor");
		System.out.println("Value passed from constructor : " + abc);
	}
	
	public int deliveryCharge() {
		return packageWeight * 50 + 10 * (fromAddress.length() - toAddress.length());
	}

	public int totalPayableAmount() {
		return paymentMethod.equals("UPI") ? price : price + 10;
	}

	public boolean isBreakable() {
		return packagingMaterial.equals("Plastic");
	}

	public boolean isLastDeliveryDate() {
		return new Date().after(lastDeliveryDate);
	}

	@Override
	public String toString() {
		return "Delivery [fromAddress=" + fromAddress + ", toAddress=" + toAddress + ", packageWeight=" + packageWeight
				+ ", price=" + price + ", paymentMethod=" + paymentMethod + ", courierCompanyName=" + courierCompanyName
				+ ", lastDeliveryDate=" + lastDeliveryDate + ", assigneeName=" + assigneeName + ", assigneeMob="
				+ assigneeMob + ", packagingMaterial=" + packagingMaterial + "]";
	}

}
