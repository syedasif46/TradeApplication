package com.tradeapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tradeapp.entity.Location;

public interface LocationRepository extends MongoRepository<Location, String> {
}