package com.tnsif.placementmanagement.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.placementmanagement.entities.College;
import com.tnsif.placementmanagement.services.CollegeService;
@RestController
public class CollegeController {
	@Autowired
	private CollegeService service;
	
	//RESTful API's method
	@PostMapping("/college")
	public void insert(@RequestBody College college)
	{
		service.create(college);
	}
	
	@DeleteMapping("/college/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	@GetMapping("/college")
	public List<College>retriveA()
	{
		return service.retriveAll();
	}
	
	@GetMapping("/college/{id}")
	public ResponseEntity<College> retreive(@PathVariable Integer id)
	{
		try {
			College college=service.retrieve(id);
			return new ResponseEntity<College>(college,HttpStatus.OK);

		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/college/{id}")
	public ResponseEntity<College>update (@RequestBody College college,@PathVariable Integer id)
	{
		try {
		College c=service.retrieve(id);
		service.create(college);
		return new ResponseEntity<College>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}
	

}
