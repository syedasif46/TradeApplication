package com.tradeapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tradeapp.entity.Commodity;

public interface CommodityRepository extends MongoRepository<Commodity, String> {
}