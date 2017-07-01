package com.tragent.lte.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tragent.lte.domain.AppUser;
import com.tragent.lte.domain.Role;
import com.tragent.lte.domain.UserDTO;
import com.tragent.lte.service.RoleService;
import com.tragent.lte.service.UserService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE,
		RequestMethod.OPTIONS })
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	/**
	 * Get all uses or user with a given username.
	 * 
	 * @param username,
	 *            isActive
	 * @return Collection of users or user with the given username
	 */
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<AppUser>> getUsers(
			@RequestParam(value = "username", required = false) String username,
			@RequestParam(value = "active", required = false) String isActive) {

		Collection<AppUser> appUsers = new ArrayList<>();
		if (username != null) {
			AppUser appUser = userService.findByUserName(username);
			appUsers.add(appUser);

		} else if (isActive != null) {
			if (isActive.compareToIgnoreCase("true") == 0) {
				Collection<AppUser> activeUsers = userService.findByIsActive(true);
				appUsers.addAll(activeUsers);

			} else if (isActive.compareToIgnoreCase("false") == 0) {
				Collection<AppUser> deActivatedUsers = userService.findByIsActive(false);
				appUsers.addAll(deActivatedUsers);

			}

		} else {
			Collection<AppUser> allUser = userService.findAll();
			appUsers.addAll(allUser);
		}

		return new ResponseEntity<>(appUsers, HttpStatus.OK);
	}

	/**
	 * Get user with given user id.
	 * 
	 * @param userId
	 * @return AppUser object or 404 if user is not found
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AppUser> getUserById(@PathVariable("id") Long userId) {

		AppUser appUser = userService.findById(userId);
		if (appUser == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(appUser, HttpStatus.OK);
	}

	/**
	 * Create new user.
	 * 
	 * @param user
	 * @return AppUser object (created user object)
	 */
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AppUser> createUser(@RequestBody UserDTO user) {
		int count = 0;
		List<Role> roles = new ArrayList<>();
		while (user.getRoleIds().size() > count) {
			roles.add(roleService.findById(user.getRoleIds().get(count++)));
		}
		AppUser newUser = new AppUser(user.getFirstName(), user.getLastName(), user.getUsername(), user.getPassword(),
				user.isActive(), roles, user.getTelephone());
		newUser = userService.create(newUser);
		if (newUser == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(newUser, HttpStatus.CREATED);
	}

	/**
	 * Update user's information.
	 * 
	 * @param userId
	 * @return AppUser object (updated user object)
	 */
	@RequestMapping(value = "/{userId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AppUser> updateUser(@RequestBody UserDTO user) {
		int count = 0;
		List<Role> roles = new ArrayList<>();
		while (user.getRoleIds().size() > count) {
			roles.add(roleService.findById(user.getRoleIds().get(count++)));
		}
		AppUser updateUser = userService.findById(user.getId());
		updateUser.setFirstName(user.getFirstName());
		updateUser.setLastName(user.getLastName());
		updateUser.setPassword(user.getPassword());
		updateUser.setTelephone(user.getTelephone());
		updateUser.setActive(user.isActive());
		updateUser.setRoles(roles);
		updateUser = userService.update(updateUser);

		if (updateUser == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(updateUser, HttpStatus.OK);
	}

	/**
	 * Delete user's information
	 * 
	 * @param userId
	 * @return HTTP status 204, .
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<AppUser> deactivateUser(@PathVariable("userId") Long userId) {

		userService.deactivate(userId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
