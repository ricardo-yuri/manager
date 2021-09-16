package com.manager.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "condominium")
public class Condominium implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idcondominium")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne
	@JoinColumn(name = "idaddress")
	private Address address;
	@OneToMany(mappedBy = "condominium")
	private List<Attractions> attractions = new ArrayList<>();
	@OneToMany(mappedBy = "condominium")
	private List<Block> block = new ArrayList<>();
	@OneToMany(mappedBy = "condominium")
	private List<Employee> employee = new ArrayList<>();
	

	public Condominium() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

}
