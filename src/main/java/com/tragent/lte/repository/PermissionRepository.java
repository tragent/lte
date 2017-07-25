package com.tragent.lte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.tragent.lte.domain.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
	
	Permission findByName(@Param("name") String name);

}
