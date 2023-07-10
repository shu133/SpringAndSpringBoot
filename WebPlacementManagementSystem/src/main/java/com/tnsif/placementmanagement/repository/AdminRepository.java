package com.tnsif.placementmanagement.repository;
//2
import org.springframework.data.jpa.repository.JpaRepository;
/*jpa repository is an interface which contains all the jpa crud operation which is required for springboot*/

import com.tnsif.placementmanagement.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer>{

}
