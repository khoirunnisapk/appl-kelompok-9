package com.appl.DAO;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.appl.Entity.Kendaraan;


@Component
public class CuciDAO {
	
	@Autowired
	private CuciRepository repository;
	
	public Collection<Kendaraan> getKendaraan(){
		return repository.findAll();
	}

	public Kendaraan createKendaraan(Kendaraan kendaraan) {
		return repository.insert(kendaraan);
	}
}
