package com.tragent.lte.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.tragent.lte.domain.AppUser;
import com.tragent.lte.repository.UserRepository;
import com.tragent.lte.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	@Override
	@Secured("ROLE_ADMIN")
	public Collection<AppUser> findAll() {
		
		List<AppUser> appUsers = userRepository.findAll();
		return appUsers;
	}

	@Override
	public AppUser findById(Long id) {
		
		AppUser appUser = userRepository.findOne(id);
		return appUser;
	}

	@Override
	public AppUser findByUserName(String username) {
		
		AppUser appUser = userRepository.findByUsername(username);
		return appUser;
	}

	@Override
	public Collection<AppUser> findByIsActive(boolean isActive) {
		
		Collection<AppUser> appUsers = userRepository.findByIsActive(isActive);
		return appUsers;
	}

	@Override
	@Secured("ROLE_ADMIN")
	public AppUser create(AppUser appUser) {
		
		if (findByUserName(appUser.getUsername()) != null) {
			return null;
		}
		appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
		AppUser savedUser = userRepository.save(appUser);
		return savedUser;
	}

	@Override
	public AppUser update(AppUser appUser) {
		
		appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
		AppUser savedUser = userRepository.save(appUser);
		return savedUser;
	}

	@Override
	@Secured("ROLE_ADMIN")
	public void deactivate(Long id) {
		
		AppUser appUser = findById(id);
		appUser.setActive(false);
	}

}
