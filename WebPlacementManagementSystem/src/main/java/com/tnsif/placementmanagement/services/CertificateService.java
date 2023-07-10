package com.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.placementmanagement.entities.Certificate;
import com.tnsif.placementmanagement.repository.CertificateRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CertificateService {
	/* to inject the dependencies automatically
	 */
	@Autowired
	private  CertificateRepository repo;

	//create and update
	public void create (Certificate certificate)
	{
		repo.save(certificate);
	}
	
	//retrieve with specific id
	public Certificate retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	
	//retrieve all the records
	public List<Certificate> retrieveAll()
	{
		return repo.findAll();
	}
	
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}

}
