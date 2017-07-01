package com.tragent.lte.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.tragent.lte.domain.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Long>{
	
	AppUser findByUsername(@Param("name") String name);
	Collection<AppUser> findByIsActive(@Param("isActive") boolean isActive);

}
