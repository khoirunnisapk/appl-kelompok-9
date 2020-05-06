package com.appl.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.appl.Entity.Kendaraan;

public interface CuciRepository extends MongoRepository<Kendaraan, Integer> {

}
