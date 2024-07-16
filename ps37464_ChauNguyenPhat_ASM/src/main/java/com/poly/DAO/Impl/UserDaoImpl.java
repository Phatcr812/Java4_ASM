package com.poly.DAO.Impl;

import java.util.List;

import com.poly.DAO.AbstractDAO;
import com.poly.DAO.UserDAO;
import com.poly.entity.User;

public class UserDaoImpl extends AbstractDAO<User> implements UserDAO{

	@Override
	public User findById(int id) {
		return super.findById(User.class, id);
	}

	@Override
	public User findByEmail(String email) {
		String sql = "SELECT o FROM [User] o WHERE o.email = ?0";
		return super.findOne(User.class, sql, email);
	}

	@Override
	public User findByName(String name) {
		String sql = "SELECT o FROM [User] o WHERE o.name = ?0";
		return super.findOne(User.class, sql, name);
	}

	@Override
	public List<User> findAll() {
		return super.findAll(User.class);
	}

	@Override
	public User updte(User entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllPage(int pageNumber, int pageSize) {
		return super.findAllPage(User.class,pageNumber,pageSize);
	}
	
}
