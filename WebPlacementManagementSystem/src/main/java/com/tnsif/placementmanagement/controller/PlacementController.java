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

import com.tnsif.placementmanagement.entities.Placement;
import com.tnsif.placementmanagement.services.PlacementService;
@RestController
public class PlacementController {
	@Autowired
	private PlacementService service;
	
	//RESTful API's method
		@PostMapping("/placement")
		public void insert(@RequestBody Placement placement)
		{
			service.create(placement);
		}
		
		@DeleteMapping("/placement/{id}")
		public void remove(@PathVariable Integer id)
		{
			service.delete(id);
		}
		
		@GetMapping("/placement")
		public List<Placement>retriveA()
		{
			return service.retrieveAll();
		}
		
		
		@GetMapping("/placement/{id}")
		public ResponseEntity<Placement> retreive(@PathVariable Integer id)
		{
			try {
				Placement placement=service.retrieve(id);
				return new ResponseEntity<Placement>(placement,HttpStatus.OK);

			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
			}
		}
		

		@PutMapping("/placement/{id}")
		public ResponseEntity<Placement>update (@RequestBody Placement placement,@PathVariable Integer id)
		{
			try {
			Placement p=service.retrieve(id);
			service.create(placement);
			return new ResponseEntity<Placement>(HttpStatus.OK);
			}
			catch(NoSuchElementException e)
			{
				return new ResponseEntity<Placement>(HttpStatus.NOT_FOUND);
			}
		}

}
