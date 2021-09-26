package com.manager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.entity.Condominium;
import com.manager.interfaces.CondominiumService;
import com.manager.repository.CondominiumRepository;

@Service
public class CondominiumServiceImpl implements CondominiumService {
	
	@Autowired
	CondominiumRepository condominiumRepository;

	public List<Condominium> findAll() {
		List<Condominium> conds = new ArrayList<Condominium>();
		conds = condominiumRepository.findAll();
		return conds;
	}

}
