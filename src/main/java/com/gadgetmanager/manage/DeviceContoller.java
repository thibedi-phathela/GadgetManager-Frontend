package com.gadgetmanager.manage;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gadgets")
public class DeviceContoller {
	
	@Autowired
	private DeviceService deviceService;
	
	@GetMapping("/devices")
	public List<Device> getAllDevices(){
		return deviceService.getAllDevices();	
	}
	
	@GetMapping("/devices/{deviceId}")
	public Optional<Device> getDevice(@PathVariable long deviceId){
		return deviceService.getDevice(deviceId);	
	}

	@PostMapping("/devices")
	public void addDevice(@RequestBody Device device){
			deviceService.addDevice(device);
	}
	
	@PutMapping("/devices/{deviceId}")
	public void updateDevice(@RequestBody Device device, @PathVariable long deviceId) {
		deviceService.updateDevice(device, deviceId);
	}

	@DeleteMapping("/devices/{deviceId}")
	public void deleteDevice(@PathVariable long deviceId){
		deviceService.deleteDevice(deviceId);	
	}

}
