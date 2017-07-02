package com.tragent.lte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tragent.lte.domain.S1Data;

@Repository
public interface S1DataRepository extends JpaRepository<S1Data, Long> {

}
