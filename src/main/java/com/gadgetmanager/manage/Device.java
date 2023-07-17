package com.gadgetmanager.manage;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Device {
	
	@Id
	private long deviceId;
	private String deviceName;
	private boolean isActive;
	
	public Device() {
		
	}
	
	public Device(long deviceId,String deviceName, boolean isActive) {
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.isActive = isActive;
		
	}
	
	//Getter and setter methods
	
	public long getDeviceId() {
		return deviceId;
	}
	
	public void setDeviceId(long deviceId) {
		this.deviceId=deviceId;
	}
	
	public String getDeviceName() {
		return deviceName;
	}
	
	public void setDeviceName(String deviceName) {
		this.deviceName=deviceName;
	}
	
	public boolean getIsActive() {
		return isActive;
	}
	
	public void setIsActive(boolean isActive) {
		this.isActive=isActive;
	}
	
	

}
