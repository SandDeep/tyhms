package com.techyolk.hms.service;

import java.util.List;

import com.techyolk.hms.model.User;

public interface UserService {

	public void addUser(User user);

	public void updateUser(User user);

	public List<User> listUsers();

	public User getUserByName(String userName);

	public void deleteUser(int userId);

}
