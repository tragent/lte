package com.tragent.lte.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="permission")
public class Permission {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false, unique=true)
	private String name;
	
	private String description;
	
	@ManyToMany(mappedBy="permissions")
	private List<Role> roles;
	
	public Permission() {
		super();
	}

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}
