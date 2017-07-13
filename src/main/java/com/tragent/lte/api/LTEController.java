package com.tragent.lte.api;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tragent.lte.domain.S1Data;
import com.tragent.lte.service.LTEGraphService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE,
		RequestMethod.OPTIONS })
@RequestMapping("s1data")
public class LTEController {

	@Autowired
	private LTEGraphService lteGraphService;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<S1Data>> getS1Data() {

		Collection<S1Data> data = new ArrayList<>();

		Collection<S1Data> allData = lteGraphService.findAll();
		data.addAll(allData);

		return new ResponseEntity<>(data, HttpStatus.OK);

	}

}
