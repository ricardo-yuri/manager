package com.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.manager.dto.AddressCondominiumDto;
import com.manager.dto.AddressDto;
import com.manager.service.AddressCondominiumService;
import com.manager.service.AddressServiceImpl;
import com.manager.service.CondominiumServiceImpl;

@ResponseBody
@RestController
@RequestMapping("/api")
public class ManagerController {

	@Autowired
	private CondominiumServiceImpl condominiumServiceImpl;
	private AddressCondominiumService addressCondominiumService;
	@Autowired
	private AddressServiceImpl addressServiceImpl;

	@PostMapping("/add-address")
	public ResponseEntity<?> add(@RequestBody AddressDto addressDto) {
		try {
			AddressDto resp = addressServiceImpl.save(addressDto);
			return ResponseEntity.status(200).body(resp);
		} catch (Exception ex) {
			return ResponseEntity.status(500).body("error:" + ex.getMessage());
		}
	}

	@PostMapping("/cond")
	public ResponseEntity<?> add(@RequestBody AddressCondominiumDto addressCondominiumDto) {
		try {
			AddressCondominiumDto resp = addressCondominiumService.save(addressCondominiumDto);
			return ResponseEntity.status(200).body(resp);
		} catch (Exception ex) {
			return ResponseEntity.status(500).body("error:" + ex.getMessage());
		}
	}

	@GetMapping("/cond")
	public ResponseEntity<?> findByCondService() {
		try {
			return ResponseEntity.status(200).body(condominiumServiceImpl.findAll());
		} catch (Exception e) {
			return ResponseEntity.status(500).body("Error: " + e.getMessage());
		}

	}
	
	@GetMapping("/address")
	public ResponseEntity<?> findByAddressService() {
		try {
			return ResponseEntity.status(200).body(addressServiceImpl.findAll());
		} catch (Exception e) {
			return ResponseEntity.status(500).body("Error: " + e.getMessage());
		}

	}
}
