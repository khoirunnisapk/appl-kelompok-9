package com.appl.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appl.Entity.Kendaraan;
import com.appl.Service.CuciService;

@RestController
@RequestMapping("/kendaraan")
public class CuciController {

	@Autowired
	private CuciService cuciService;

	@GetMapping
	public Collection<Kendaraan> getKendaraan() {
		return cuciService.getKendaraan();
	}
	
	@PostMapping
	public Kendaraan postKendaraan(@RequestBody Kendaraan kendaraan) {
		return cuciService.createKendaraan(kendaraan);
	}
}