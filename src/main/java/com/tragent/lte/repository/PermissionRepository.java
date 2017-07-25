package com.tragent.lte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tragent.lte.domain.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
	
	Permission findByName(@Param("name") String name);

}
