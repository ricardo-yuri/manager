package com.manager.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.manager.dto.AddressCondominiumDto;
import com.manager.entity.Address;
import com.manager.entity.Condominium;
import com.manager.repository.AddressRepository;
import com.manager.repository.CondominiumRepository;

public class AddressCondominiumService {

	@Autowired
	private CondominiumRepository condominiumRepository;
	
	@Autowired
	private AddressRepository addressRepository;

	@Transactional
	public AddressCondominiumDto save(AddressCondominiumDto dto) {
		AddressCondominiumDto dtos = dto;
		Address address = dto.convertToAddress();
		Condominium condominium = dto.convertToCondominium();
		condominiumRepository.save(condominium);
		addressRepository.save(address);
		return dtos;
	}
	
}
