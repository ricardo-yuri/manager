package com.manager.dto;

import com.manager.entity.Address;

public class AddressDto {

	private Integer id;
	private String city;
	private String state;
	private String publicPlace;
//	private Condominium condominium;

	public AddressDto() {

	}

	public AddressDto(Integer id, String city, String state, String publicPlace) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.publicPlace = publicPlace;
	}
	
	public Address convertToAddress() {
		Address address = new Address();
		address.setId(getId());
		address.setCity(getCity());
		address.setState(getState());
		address.setPublicPlace(getPublicPlace());
		return address;
		
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

}
