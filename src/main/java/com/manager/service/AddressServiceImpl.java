package com.manager.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.dto.AddressDto;
import com.manager.entity.Address;
import com.manager.interfaces.AddressService;
import com.manager.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepository addressRepository;

	@Transactional
	public AddressDto save(AddressDto dto) {
		AddressDto dtos = dto;
		Address address = dto.convertToAddress();
		addressRepository.save(address);
		return dtos;
	}

	@Transactional
	public List<Address> findAll() {
		List<Address> address = new ArrayList<>();
		address = addressRepository.findAll();
		return address;
	}

}
