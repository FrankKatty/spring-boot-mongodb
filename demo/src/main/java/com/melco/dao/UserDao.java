package com.melco.dao;

import java.util.List;

import com.melco.domain.User;

public interface UserDao {
	
	void saveUser(User user);
	
	List<User> getAllUsers();
	
	User getUserByUserId(String userId);

}
