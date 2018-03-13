package com.tradeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tradeapp.entity.Location;
import com.tradeapp.repositories.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	private LocationRepository locationRepository;
	
	public boolean isLocationExists(String id) {
		return locationRepository.existsById(id);
	}
	
	public List<Location> retrieveAllLocations(){
		return locationRepository.findAll();
	}
	
	public Location retrieveLocation(String id){
		return locationRepository.findById(id).get();
	}
	
	
	public void removeLocation(String id){
		locationRepository.deleteById(id);
	}
	
	public Location createLocation(Location location) {
		return locationRepository.save(location);
	}
}
