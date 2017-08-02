package com.tragent.lte.api;

import java.util.ArrayList;
import java.util.Collection;

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
import com.tragent.lte.service.PermissionService;

@RestController
@RequestMapping("permissions")
public class PermissionController {

	@Autowired
	private PermissionService permissionService;
		
	/**
	 * Get all permissions or permission with a given name.
	 * 
	 * @param permissionName
	 * @return Collection of permissions or permission with the given name
	 */
	@RequestMapping(method=RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Permission>> getPermissions(@RequestParam(value = "permissionName", required = false) String permissionName) {
		
		Collection<Permission> permissions = new ArrayList<>();
		if (permissionName != null) {
			Permission permission = permissionService.findByName(permissionName);
			permissions.add(permission);
			
		} else {
			Collection<Permission> allPermission = permissionService.findAll();
			permissions.addAll(allPermission);
		}
		
		return new ResponseEntity<>(permissions, HttpStatus.OK);	
	}
	
	/**
	 * Get permission with a given id.
	 * 
	 * @param permissionId
	 * @return Permission object or 404 if permission is not found
	 */
	@RequestMapping(value="/{permissionId}",
			method=RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Permission> getPermissionById(@PathVariable("permissionId") Long permissionId){
		
		Permission permission = permissionService.findById(permissionId);
		if (permission == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(permission, HttpStatus.OK);
	}
	
	/**
	 * Create new permission.
	 * 
	 * @param newPermission
	 * @return Permission object (created object)
	 */
	@RequestMapping(method=RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Permission> createPermission(@RequestBody Permission newPermission){
		
		newPermission = permissionService.create(newPermission);
		if (newPermission == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>(newPermission, HttpStatus.CREATED);	
	}
	
	/**
	 * Update permission record.
	 * 
	 * @param permission
	 * @return Permission object (updated object)
	 */
	@RequestMapping(value="/{permissionId}",
			method=RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Permission> updatePermission(@RequestBody Permission permission){
		
		permission = permissionService.update(permission);
		if (permission == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>(permission, HttpStatus.OK);
	}
	
}
