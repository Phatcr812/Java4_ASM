package com.poly.DAO;

import java.util.List;

import com.poly.entity.User;

public interface UserDAO {
	User findById(int id);
	User findByEmail(String email);
	User findByName(String name);
	List<User> findAll();
	List<User> findAllPage(int pageNumber, int pageSize);
	User create(User entity);
	User updte(User entity);
	User delete(User entity);
}
