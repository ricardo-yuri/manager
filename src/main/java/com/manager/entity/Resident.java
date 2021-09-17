package com.manager.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "resident")
public class Resident implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idresident")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "cpf")
	private String cpf;
	@Column(name = "phone")
	private String phone;
	@Column(name = "sexo")
	private Integer sexo;
	@Column(name = "birthDate")
	private Date birthDate;
	@ManyToOne
	@JoinColumn(name = "idapartment" , referencedColumnName = "idapartment" )
	private Apartment apartment;

}
