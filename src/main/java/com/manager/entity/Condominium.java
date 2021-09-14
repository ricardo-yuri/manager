package com.manager.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "condominium")
public class Condominium implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "idcondominium")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

}
