package com.tragent.lte.domain;

import java.util.ArrayList;

public class RoleDTO {
	private Long id;
	private String name;
	private String description;
	private ArrayList<Long> permissionIds;
	
	public RoleDTO() {
		super();
	}

	public RoleDTO(String name, String description, ArrayList<Long> permissionIds) {
		super();
		this.name = name;
		this.description = description;
		this.permissionIds = permissionIds;
	}

	public RoleDTO(Long id, String name, String description, ArrayList<Long> permissionIds) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.permissionIds = permissionIds;
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

	public ArrayList<Long> getPermissionIds() {
		return this.permissionIds;
	}

	public void setPermissionIds(ArrayList<Long> permissionIds) {
		this.permissionIds = permissionIds;
	}
	
}