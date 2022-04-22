package com.java.practice.model;

public class Room {
	
	private short roomNum;
	private byte numOfDoor;
	private byte numOfWindow;
	private byte numOfChhajja;
	private byte numOfBulb;
	private byte numOfElectricBoard;
	private byte numOfHangar;
	
	public short getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(short roomNum) {
		this.roomNum = roomNum;
	}
	public byte getNumOfDoor() {
		return numOfDoor;
	}
	public void setNumOfDoor(byte numOfDoor) {
		this.numOfDoor = numOfDoor;
	}
	public byte getNumOfWindow() {
		return numOfWindow;
	}
	public void setNumOfWindow(byte numOfWindow) {
		this.numOfWindow = numOfWindow;
	}
	public byte getNumOfChhajja() {
		return numOfChhajja;
	}
	public void setNumOfChhajja(byte numOfChhajja) {
		this.numOfChhajja = numOfChhajja;
	}
	public byte getNumOfBulb() {
		return numOfBulb;
	}
	public void setNumOfBulb(byte numOfBulb) {
		this.numOfBulb = numOfBulb;
	}
	public byte getNumOfElectricBoard() {
		return numOfElectricBoard;
	}
	public void setNumOfElectricBoard(byte numOfElectricBoard) {
		this.numOfElectricBoard = numOfElectricBoard;
	}
	public byte getNumOfHangar() {
		return numOfHangar;
	}
	public void setNumOfHangar(byte numOfHangar) {
		this.numOfHangar = numOfHangar;
	}
	@Override
	public String toString() {
		return "Room [roomNum=" + roomNum + ", numOfDoor=" + numOfDoor + ", numOfWindow=" + numOfWindow
				+ ", numOfChhajja=" + numOfChhajja + ", numOfBulb=" + numOfBulb + ", numOfElectricBoard="
				+ numOfElectricBoard + ", numOfHangar=" + numOfHangar + "]";
	}
	
}
