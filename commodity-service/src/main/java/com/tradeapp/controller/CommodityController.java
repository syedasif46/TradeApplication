package com.tradeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tradeapp.entity.Commodity;
import com.tradeapp.service.CommodityService;

@RestController
public class CommodityController {
	@Autowired
	private CommodityService commodityService;
	
	@GetMapping(value="/commodity")
	public List<Commodity> retrieveAllCommodities(){
		return commodityService.retrieveAllCommodities();
	}
	
	@GetMapping(value="/commodity/{id}")
	public Commodity retrieveCommodity(@PathVariable String id){
		Commodity commodity = commodityService.retrieveCommodity(id);
		return commodity;
	}
	
	
	@DeleteMapping(value="/commodity/{id}")
	public boolean removeCommodity(@PathVariable String id){
		boolean success = false;
		commodityService.removeCommodity(id);
		if(!commodityService.isCommodityExists(id)) {
			success = true;
		}
		return success;
	}
	
	@PostMapping(value="/commodity")
	public boolean createCommodity(@RequestBody Commodity commodity) {
		boolean success = false;
		Commodity savedCommodity = commodityService.createCommodity(commodity);
		if(savedCommodity != null) {
			success = true;
		}
		return success;
		
	}
	
}
