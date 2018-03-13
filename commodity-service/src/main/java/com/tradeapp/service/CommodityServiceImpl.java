package com.tradeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tradeapp.entity.Commodity;
import com.tradeapp.repositories.CommodityRepository;

@Service
public class CommodityServiceImpl implements CommodityService {
	@Autowired
	private CommodityRepository commodityRepository;
	
	public boolean isCommodityExists(String id) {
		return commodityRepository.existsById(id);
	}
	
	public List<Commodity> retrieveAllCommodities(){
		return commodityRepository.findAll();
	}
	
	public Commodity retrieveCommodity(String id){
		return commodityRepository.findById(id).get();
	}
	
	
	public void removeCommodity(String id){
		commodityRepository.deleteById(id);
	}
	
	public Commodity createCommodity(Commodity commodity) {
		return commodityRepository.save(commodity);
	}
}
