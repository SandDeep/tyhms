package com.techyolk.hms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.techyolk.hms.dao.UserDao;
import com.techyolk.hms.model.User;
import com.techyolk.hms.service.UserService;

@Service
@Primary
@Component("userService")
public class UserServiceImpl implements UserService {

	@Resource(name="userDao")
	UserDao userDao;

	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	public List<User> listUsers() {
		return userDao.listUsers();
	}

	@Override
	public User getUserByName(String userName) {
		return userDao.getUserByName(userName);
	}

	@Override
	public void deleteUser(int userId) {
		userDao.deleteUser(userId);
	}

}
