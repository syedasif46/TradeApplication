package com.tradeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tradeapp.entity.Location;
import com.tradeapp.service.LocationService;

@RestController
public class LocationController {
	@Autowired
	private LocationService locationService;
	
	@GetMapping(value="/location")
	public List<Location> retrieveAllCommodities(){
		return locationService.retrieveAllLocations();
	}
	
	@GetMapping(value="/location/{id}")
	public Location retrieveCommodity(@PathVariable String id){
		Location commodity = locationService.retrieveLocation(id);
		return commodity;
	}
	
	
	@DeleteMapping(value="/location/{id}")
	public boolean removeCommodity(@PathVariable String id){
		boolean success = false;
		locationService.removeLocation(id);
		if(!locationService.isLocationExists(id)) {
			success = true;
		}
		return success;
	}
	
	@PostMapping(value="/location")
	public boolean createCommodity(@RequestBody Location commodity) {
		boolean success = false;
		Location savedCommodity = locationService.createLocation(commodity);
		if(savedCommodity != null) {
			success = true;
		}
		return success;
		
	}
	
}
