package com.tragent.pressing.domain;

import java.util.ArrayList;

public class UserDTO {
	private Long id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private boolean isActive;
	private ArrayList<Long> roleIds;
	private String telephone;
	
	public UserDTO() {
		super();
	}

	public UserDTO(Long id, String firstName, String lastName, String username, boolean isActive, Long roleId, String telephone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.isActive = isActive;
		this.roleIds.add(roleId);
		this.telephone = telephone;
		
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return this.isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public ArrayList<Long> getRoleIds() {
		return this.roleIds;
	}

	public void setRoleIds(ArrayList<Long> roleIds) {
		this.roleIds = roleIds;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
}