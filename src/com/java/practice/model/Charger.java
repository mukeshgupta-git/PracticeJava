package com.java.practice.model;

public class Charger {

	private int inputPin;
	private String bodyType;
	private int outputPin;
	private String circuitName;
	private String chargerName;
	private int inputVolt;
	private int outputVold;
	private int wireLength;
	private String pingType;
	public int getInputPin() {
		return inputPin;
	}
	public void setInputPin(int inputPin) {
		this.inputPin = inputPin;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public int getOutputPin() {
		return outputPin;
	}
	public void setOutputPin(int outputPin) {
		this.outputPin = outputPin;
	}
	public String getCircuitName() {
		return circuitName;
	}
	public void setCircuitName(String circuitName) {
		this.circuitName = circuitName;
	}
	public String getChargerName() {
		return chargerName;
	}
	public void setChargerName(String chargerName) {
		this.chargerName = chargerName;
	}
	public int getInputVolt() {
		return inputVolt;
	}
	public void setInputVolt(int inputVolt) {
		this.inputVolt = inputVolt;
	}
	public int getOutputVold() {
		return outputVold;
	}
	public void setOutputVold(int outputVold) {
		this.outputVold = outputVold;
	}
	public int getWireLength() {
		return wireLength;
	}
	public void setWireLength(int wireLength) {
		this.wireLength = wireLength;
	}
	public String getPingType() {
		return pingType;
	}
	public void setPingType(String pingType) {
		this.pingType = pingType;
	}
	@Override
	public String toString() {
		return "Charger [inputPin=" + inputPin + ", bodyType=" + bodyType + ", outputPin=" + outputPin
				+ ", circuitName=" + circuitName + ", chargerName=" + chargerName + ", inputVolt=" + inputVolt
				+ ", outputVold=" + outputVold + ", wireLength=" + wireLength + ", pingType=" + pingType + "]";
	}
	
		
}
