package com.manager.dto;

import java.util.Date;

import com.manager.entity.Apartment;
import com.manager.entity.Resident;

public class ResidentDto {

	private Integer id;
	private String name;
	private String cpf;
	private String phone;
	private Integer sexo;
	private Date birthDate;
	private Apartment apartment;

	public ResidentDto() {

	}

	public ResidentDto(Integer id, String name, String cpf, String phone, Integer sexo, Date birthDate,
			Apartment apartment) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.phone = phone;
		this.sexo = sexo;
		this.birthDate = birthDate;
		this.apartment = apartment;
	}
	
	public Resident residentDtoToResident() {
		Resident resident = new Resident(getId(), getName(), getCpf(), getPhone(), getSexo(), getBirthDate(), getApartment());
		return resident;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Apartment getApartment() {
		return apartment;
	}

	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}

}
