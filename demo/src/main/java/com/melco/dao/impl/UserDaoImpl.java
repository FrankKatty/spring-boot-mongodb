package com.melco.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.melco.dao.UserDao;
import com.melco.domain.User;

@Repository("userDao")

public class UserDaoImpl implements UserDao {
	
	@Autowired
    private MongoTemplate mongoTemplate;

	@Override
	public void saveUser(User user) {
		mongoTemplate.insert(user);
		
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> getAllUsers() {
		 return mongoTemplate.find(new Query(), User.class);
	}

	@Override
	public User getUserByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
