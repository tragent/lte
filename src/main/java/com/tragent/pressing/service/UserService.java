package com.tragent.pressing.service;

import java.util.Collection;

import com.tragent.pressing.domain.AppUser;

/**
 * Service that provides CRUD operations for users
 **/
public interface UserService {

	/**
	 * Get all users in the system.
	 * 
	 * @return Collection of all users 
	 */
	public Collection<AppUser> findAll();
	
	/**
	 * Find an user by Id.
	 * 
	 * @param id
	 * @return AppUser object if found, else return null
	 */
	public AppUser findById(Long id);
	
	/**
	 * Find an user by username.
	 * 
	 * @param username
	 * @return AppUser object if found, else return null
	 */
	public AppUser findByUserName(String username);
	
	/**
	 * Find users with active accounts.
	 * 
	 * @param isActive
	 * @return Collection of users
	 */
	public Collection<AppUser> findByIsActive(boolean isActive);
	
	/**
	 * Create new user.
	 * 
	 * @param appUser
	 * @return AppUser object (Created user object)
	 */
	public AppUser create(AppUser appUser);
	
	/**
	 * Update an existing user's information.
	 * 
	 * @param appUser
	 * @return AppUser object (Updated user object)
	 */
	public AppUser update(AppUser appUser);
	
	/**
	 * Deactivate a user's account.
	 * 
	 * @param id
	 */
	public void deactivate(Long id);
	
}
