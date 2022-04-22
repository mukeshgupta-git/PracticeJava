package com.java.practice.objects;

public class AsusLaptop {

	String modelName;
	float weight;
	String bodyMaterial;
	int memoryInGB;
	int ramInGB;
	int cameraInMP;
	boolean isBiometricLogin;
	boolean isBattery;
	boolean isCharger;

	public float batteryBackupTime() {
		return isBattery ? 10 : 0;
	}

	public float price() {
		return (ramInGB + 2 * memoryInGB) * 5000;
	}
 
	public float weight() {
		return (memoryInGB + 2 + 4);
	}
}
