package com.tragent.lte.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "role")
public class Role implements GrantedAuthority {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false, unique = true)
	private String name;

	private String description;

	@Column(nullable = false)
	@ManyToMany(mappedBy = "roles")
	private List<AppUser> users;

	@Column(nullable = false)
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "role_permission", joinColumns = @JoinColumn(name = "role_id", nullable = false), inverseJoinColumns = @JoinColumn(name = "permission_id", nullable = false))
	private List<Permission> permissions;

	public Role() {
		super();
	}

	public Role(String name, String description, List<Permission> permissions) {
		super();
		this.name = name;
		this.description = description;
		this.permissions = permissions;
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

	public List<Permission> getPermission() {
		return this.permissions;
	}

	public void setPermission(List<Permission> permission) {
		this.permissions = permission;
	}

	@Override
	public String getAuthority() {
		return name.toString();
	}

}
