package com.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.placementmanagement.entities.College;
import com.tnsif.placementmanagement.repository.CollegeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class CollegeService {
	/*to inject the dependency automatically*/
	@Autowired
	private CollegeRepository repo;
	
	//create and update
	public void create(College college)
	{
		repo.save(college);
	}
	//retrieve with Specific ID
	public College retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	//retrieve all records
	public  List<College> retriveAll()
	{
		return repo.findAll();
	}
	
	//delete with specific record
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}

}
