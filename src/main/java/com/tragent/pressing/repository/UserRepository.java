package com.tragent.pressing.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.tragent.pressing.domain.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Long>{
	
	AppUser findByUsername(@Param("name") String name);
	Collection<AppUser> findByIsActive(@Param("isActive") boolean isActive);

}
