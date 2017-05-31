package com.tragent.pressing.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.tragent.pressing.domain.AppUser;
import com.tragent.pressing.repository.UserRepository;

/**
 * Custom UserDetail service
 */
public class CustomUserDetailService implements UserDetailsService {

	private UserRepository userRepository;
	final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	public CustomUserDetailService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;

	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		AppUser appUser = userRepository.findByUsername(username);
		if (appUser == null || appUser.isActive() == false) {
			throw new UsernameNotFoundException(username);
		}
		User foundUser = new User(appUser.getUsername(), appUser.getPassword(), appUser.isActive(), true, true, true,
				appUser.getRoles());
		return foundUser;
	}

}
