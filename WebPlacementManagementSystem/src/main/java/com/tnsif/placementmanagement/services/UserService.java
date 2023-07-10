package com.tnsif.placementmanagement.services;

import com.tnsif.placementmanagement.entities.User;

public interface UserService {
	 User createUser(User user);
	    User login(String username, String password);
	    void logout();

}
