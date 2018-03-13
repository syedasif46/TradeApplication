package com.tradeapp.service;

import java.util.List;

import com.tradeapp.entity.Location;

public interface LocationService {
	public List<Location> retrieveAllLocations();
	
	public Location retrieveLocation(String id);	
	
	public void removeLocation(String id);
	
	public Location createLocation(Location commodity) ;
	
	public boolean isLocationExists(String id);
}
