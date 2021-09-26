package com.manager.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.manager.dto.AddressDto;
import com.manager.entity.Address;
import com.manager.repository.AddressRepository;

public class AddressServiceImpl {
	
	@Autowired
	private AddressRepository addressRepository;

	@Transactional
	public AddressDto save(AddressDto dto) {
		AddressDto dtos = dto;
		Address address = dto.convertToAddress();
		addressRepository.save(address);
		return dtos;
	}

}
