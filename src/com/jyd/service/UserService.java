package com.jyd.service;

import java.util.List;

import com.jyd.vo.User;

public interface UserService {
	public List<User> list();
	public boolean save(User user);
}
