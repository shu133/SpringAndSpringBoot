package com.tnsif.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.placementmanagement.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
	User findByUsername(String username);

}
