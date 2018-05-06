package com.jyd.dao;

import java.util.List;

import com.jyd.vo.User;

public interface UserDao {
	public List<User> list();
	public boolean save(User user);
}
