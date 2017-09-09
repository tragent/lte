package com.tragent.lte.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tragent.lte.service.LTEPerformanceService;

@RestController
public class UploadResource {
	
	@Autowired
	private LTEPerformanceService lteService;
	
	@PostMapping("/upload")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile uploadedFile){
		
		lteService.saveToDatabase(uploadedFile);
		
		return new ResponseEntity("Successfully uploaded - " +
                uploadedFile.getOriginalFilename(), new HttpHeaders(), HttpStatus.OK);
		
	}

}
