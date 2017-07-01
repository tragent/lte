package com.tragent.lte.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tragent.lte.domain.AppUser;
import com.tragent.lte.service.UserService;

import org.springframework.security.core.context.SecurityContextHolder;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE,
		RequestMethod.OPTIONS })
@RequestMapping("auth")
public class AuthenticationController {

	@Autowired
	private UserService userService;

	/**
	 * Authenticate user
	 * 
	 * @param username
	 * @return Logged in user
	 */
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AppUser> getCategories() {

		AppUser loggedInUser = userService
				.findByUserName(SecurityContextHolder.getContext().getAuthentication().getName());

		return new ResponseEntity<>(loggedInUser, HttpStatus.OK);
	}
}
