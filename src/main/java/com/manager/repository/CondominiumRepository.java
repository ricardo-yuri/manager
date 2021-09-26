package com.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manager.entity.Condominium;

@Repository
public interface CondominiumRepository extends JpaRepository<Condominium, Integer> {

}
