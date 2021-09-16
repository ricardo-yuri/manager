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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "attractions")
public class Attractions implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idattractions")
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "idcondominium")
	private Condominium condominium;
	@ManyToMany(mappedBy = "attractions")
	private List<Block> blocks = new ArrayList<Block>();

}
