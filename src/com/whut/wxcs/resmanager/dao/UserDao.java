package com.whut.wxcs.resmanager.dao;

import com.whut.wxcs.resmanager.bean.User;

public interface UserDao {

	public void insert(User user);
	public User getUserById(long id);
	public void updateUser(User user);
	public void deleteUserById(long id);
	
}
