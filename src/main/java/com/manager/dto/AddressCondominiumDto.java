package com.manager.dto;

import java.util.ArrayList;
import java.util.List;

import com.manager.entity.Address;
import com.manager.entity.Attractions;
import com.manager.entity.Block;
import com.manager.entity.Condominium;
import com.manager.entity.Employee;

public class AddressCondominiumDto {

	private Integer id;
	private String city;
	private String state;
	private String publicPlace;
	private Condominium condominium;
	private Integer idCondominium;
	private Address address;
	private List<Attractions> attractions = new ArrayList<>();
	private List<Block> block = new ArrayList<>();
	private List<Employee> employee = new ArrayList<>();

	public AddressCondominiumDto() {

	}

	public AddressCondominiumDto(String city, String state, String publicPlace, Condominium condominium,
			Address address, List<Attractions> attractions, List<Block> block, List<Employee> employee) {
		super();
		this.city = city;
		this.state = state;
		this.publicPlace = publicPlace;
		this.condominium = condominium;
		this.address = address;
		this.attractions = attractions;
		this.block = block;
		this.employee = employee;
	}

	public Address convertToAddress() {
		Address address = new Address(getId(), getCity(), getState(), getPublicPlace(), getCondominium());
		return address;
	}

	public Condominium convertToCondominium() {
		Condominium condominium = new Condominium();
		condominium.setId(getIdCondominium());
		condominium.setAddress(getAddress());
		condominium.setBlock(getBlock());
		condominium.setEmployee(getEmployee());
		return condominium;

	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPublicPlace() {
		return publicPlace;
	}

	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}

	public Condominium getCondominium() {
		return condominium;
	}

	public void setCondominium(Condominium condominium) {
		this.condominium = condominium;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Attractions> getAttractions() {
		return attractions;
	}

	public void setAttractions(List<Attractions> attractions) {
		this.attractions = attractions;
	}

	public List<Block> getBlock() {
		return block;
	}

	public void setBlock(List<Block> block) {
		this.block = block;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdCondominium() {
		return idCondominium;
	}

	public void setIdCondominium(Integer idCondominium) {
		this.idCondominium = idCondominium;
	}

}
