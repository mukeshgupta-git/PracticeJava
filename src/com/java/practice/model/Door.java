package com.java.practice.model;

public class Door {
	
	private byte doorHeight;
	private byte doorWidth;
	private byte doorThickness;
	private String doorMaterialType;
	private boolean hasDoorLock;
	private String doorColour;
	private int doorRate;
	private byte doorHingeCount;
	
	public byte getDoorHeight() {
		return doorHeight;
	}
	public void setDoorHeight(byte doorHeight) {
		this.doorHeight = doorHeight;
	}
	public byte getDoorWidth() {
		return doorWidth;
	}
	public void setDoorWidth(byte doorWidth) {
		this.doorWidth = doorWidth;
	}
	public byte getDoorThickness() {
		return doorThickness;
	}
	public void setDoorThickness(byte doorThickness) {
		this.doorThickness = doorThickness;
	}
	public String getDoorMaterialType() {
		return doorMaterialType;
	}
	public void setDoorMaterialType(String doorMaterialType) {
		this.doorMaterialType = doorMaterialType;
	}
	public boolean isHasDoorLock() {
		return hasDoorLock;
	}
	public void setHasDoorLock(boolean hasDoorLock) {
		this.hasDoorLock = hasDoorLock;
	}
	public String getDoorColour() {
		return doorColour;
	}
	public void setDoorColour(String doorColour) {
		this.doorColour = doorColour;
	}
	public int getDoorRate() {
		return doorRate;
	}
	public void setDoorRate(int doorRate) {
		this.doorRate = doorRate;
	}
	public byte getDoorHingeCount() {
		return doorHingeCount;
	}
	public void setDoorHingeCount(byte doorHingeCount) {
		this.doorHingeCount = doorHingeCount;
	}
	@Override
	public String toString() {
		return "door [doorHeight=" + doorHeight + ", doorWidth=" + doorWidth + ", doorThickness=" + doorThickness
				+ ", doorMaterialType=" + doorMaterialType + ", hasDoorLock=" + hasDoorLock + ", doorColour="
				+ doorColour + ", doorRate=" + doorRate + ", doorHingeCount=" + doorHingeCount + "]";
	}
	
	
}
