package com.techyolk.hms.dao;

import java.util.List;

import com.techyolk.hms.model.User;

public interface UserDao {
	public void addUser(User user);

	public void updateUser(User user);

	public List<User> listUsers();

	public User getUserByName(String username);

	public void deleteUser(int id);
}
