package com.tnsif.placementmanagement.controller;
//program to demonstrate on Restful API's and it contains business logic of an application
//3
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

import com.tnsif.placementmanagement.entities.Admin;
import com.tnsif.placementmanagement.services.AdminService;
/* it is used to create controller for REST API's which can return JSON*/

@RestController
public class AdminController {
	@Autowired
	private AdminService service;
	//RESTful API's method
	@PostMapping("/admin")
	public void insert (@RequestBody Admin admin)
	{
		service.create(admin);
	}
	@DeleteMapping("/admin/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	@GetMapping("/admin")
	public List<Admin>retriveA()
	{
		return service.retriveAll();
		
	}
	
	@GetMapping("admin/{id}")
	public ResponseEntity<Admin> retreive(@PathVariable Integer id)
	{
		try {
			Admin admin=service.retrieve(id);
			return new ResponseEntity<Admin>(admin,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
		}
	}
	@PutMapping("/admin/{id}")
	public ResponseEntity<Admin>update (@RequestBody Admin admin,@PathVariable Integer id)
	{
		try {
			Admin a=service.retrieve(id);
			service.create(admin);
			return new ResponseEntity<Admin>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
		}
	}

}
