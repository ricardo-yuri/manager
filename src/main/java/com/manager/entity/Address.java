package com.manager.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "address")
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idaddress")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("idAddress")
	private Integer id;
	@Column(name = "city")
	@JsonProperty("city")
	private String city;
	@Column(name = "state")
	@JsonProperty("state")
	private String state;
	@Column(name = "publicplace")
	@JsonProperty("publicPlace")
	private String publicPlace;
	@OneToOne(mappedBy = "address")
	@JsonIgnore
	private Condominium condominium;

	public Address() {

	}

	public Address(Integer id, String city, String state, String publicPlace, Condominium condominium) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.publicPlace = publicPlace;
		this.condominium = condominium;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

}
