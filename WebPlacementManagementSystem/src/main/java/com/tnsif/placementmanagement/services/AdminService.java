package com.tnsif.placementmanagement.services;
//4
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.placementmanagement.entities.Admin;
import com.tnsif.placementmanagement.repository.AdminRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminService {
	//to inject the dependency automatically
	@Autowired
	private AdminRepository repo;
	
	//create
	public void create(Admin admin) {
		repo.save(admin);
	}
	//retrieve with specific ID
	public Admin retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	//retrieve all records
	public List<Admin> retriveAll()
	{
		return repo.findAll();
	}
	//delete with specific record
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}

}
