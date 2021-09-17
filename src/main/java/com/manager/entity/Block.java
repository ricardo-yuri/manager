package com.manager.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "block")
public class Block implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idblock")
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "idcondominium")
	private Condominium condominium;
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "block_attractions", joinColumns = { @JoinColumn(name = "idblock") }, inverseJoinColumns = {
	@JoinColumn(name = "idattractions") })
	List<Attractions> attractions = new ArrayList<>();

}
