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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "job") //CARGO
public class Job implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idjob")
	private Integer id;
	@Column(name = "name")
	private String name;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "job")
	private List<Employee> employees = new ArrayList<>();

}
