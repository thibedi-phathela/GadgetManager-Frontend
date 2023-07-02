package com.gadgetmanager.manage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	//Retrieves all devices 
	public List<Device> getAllDevices(){
		List<Device> devices = new ArrayList<>();
		deviceRepository.findAll()
		.forEach(devices::add);
		return devices;
	}
	
	//Retrieves a device specified by its id 
	public Optional<Device> getDevice(long deviceId){
		return deviceRepository.findById(deviceId);
	}
	
	//Adds a new device
	public void addDevice(Device device) {
		deviceRepository.save(device);
	}
	
	//Updates an existing device
	public void updateDevice(Device device, long deviceId) {
		deviceRepository.save(device);
	}
	
	//Deletes a device by its id
	public void deleteDevice(long deviceId) {
		deviceRepository.deleteById(deviceId);
	}

}
