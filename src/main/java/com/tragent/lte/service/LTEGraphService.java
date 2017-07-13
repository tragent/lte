package com.tragent.lte.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tragent.lte.domain.S1Data;
import com.tragent.lte.repository.S1DataRepository;

@Service
public class LTEGraphService {
	
	@Autowired
	private S1DataRepository s1DataRepository;
	
	public Collection<S1Data> findAll(){
	
	List<S1Data> data = s1DataRepository.findAll();
	
	return data;
	
	}

}
