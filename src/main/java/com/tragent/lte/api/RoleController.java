package com.tragent.lte.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tragent.lte.domain.Permission;
import com.tragent.lte.domain.Role;
import com.tragent.lte.domain.RoleDTO;
import com.tragent.lte.service.PermissionService;
import com.tragent.lte.service.RoleService;

@RestController
@RequestMapping("roles")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@Autowired
	private PermissionService permissionService;

	/**
	 * Get all roles or role with a given name.
	 * 
	 * @param roleName
	 * @return Collection of roles in the system or role with the given name
	 */
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Role>> getRoles(
			@RequestParam(value = "roleName", required = false) String roleName) {

		Collection<Role> roles = new ArrayList<>();
		if (roleName != null) {
			Role role = roleService.findByName(roleName);
			roles.add(role);

		} else {
			Collection<Role> allRole = roleService.findAll();
			roles.addAll(allRole);
		}

		return new ResponseEntity<>(roles, HttpStatus.OK);
	}

	/**
	 * Get role with a given id.
	 * 
	 * @param roleId
	 * @return Role object or 404 if role is not found
	 */
	@RequestMapping(value = "/{roleId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Role> getPaymentMethodById(@PathVariable("roleId") Long roleId) {

		Role role = roleService.findById(roleId);
		if (role == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(role, HttpStatus.OK);
	}

	/**
	 * Get all permissions in role.
	 * 
	 * @param roleId
	 * @return Collection of permissions
	 */
	@RequestMapping(value = "/{roleId}/permissions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Permission>> getRolePermissions(@PathVariable("roleId") Long roleId) {

		Collection<Permission> permissions = roleService.findById(roleId).getPermission();
		if (permissions == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(permissions, HttpStatus.OK);
	}

	/**
	 * Create new role.
	 * 
	 * @param newRole
	 * @return Role Object (created role object)
	 */
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Role> createRole(@RequestBody RoleDTO role) {
		int count = 0;
		List<Permission> permissions = new ArrayList<>();
		while (role.getPermissionIds().size() > count) {
			permissions.add(permissionService.findById(role.getPermissionIds().get(count++)));
		}
		Role newRole = new Role(role.getName(), role.getDescription(), permissions);
		newRole = roleService.create(newRole);
		if (newRole == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<>(newRole, HttpStatus.CREATED);
	}

	/**
	 * Update role record.
	 * 
	 * @param role
	 * @return Role object (updated role object).
	 */
	@RequestMapping(value = "/{roleId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Role> updateRole(@RequestBody RoleDTO role) {
		int count = 0;
		List<Permission> permissions = new ArrayList<>();
		while (role.getPermissionIds().size() > count) {
			permissions.add(permissionService.findById(role.getPermissionIds().get(count++)));
		}
		Role newRole = roleService.findById(role.getId());
		newRole.setDescription(role.getDescription());
		newRole.setPermission(permissions);
		newRole = roleService.create(newRole);
		newRole = roleService.update(newRole);

		if (newRole == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<>(newRole, HttpStatus.OK);
	}

}
