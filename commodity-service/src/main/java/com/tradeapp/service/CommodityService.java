package com.tradeapp.service;

import java.util.List;

import com.tradeapp.entity.Commodity;

public interface CommodityService {
	public List<Commodity> retrieveAllCommodities();
	
	public Commodity retrieveCommodity(String id);	
	
	public void removeCommodity(String id);
	
	public Commodity createCommodity(Commodity commodity) ;
	
	public boolean isCommodityExists(String id);
}
