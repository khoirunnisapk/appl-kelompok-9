package com.appl.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appl.DAO.CuciDAO;
import com.appl.Entity.Kendaraan;

@Service
public class CuciService {

	@Autowired
	private CuciDAO cuciDAO;
	public Collection<Kendaraan> getKendaraan(){
		return cuciDAO.getKendaraan();
		
	}
	public Kendaraan createKendaraan(Kendaraan kendaraan) {
		return cuciDAO.createKendaraan(kendaraan);
	}
}
