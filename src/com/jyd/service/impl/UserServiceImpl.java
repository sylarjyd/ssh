package com.jyd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jyd.dao.UserDao;
import com.jyd.service.UserService;
import com.jyd.vo.User;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	@Qualifier("userDao")//?
	private UserDao userDao=null;
	
//	public void setUserDao(UserDao userDao) {
//		this.userDao = userDao;
//	}

	@Override
	public List<User> list() {
		return userDao.list();
	}

	@Override
	public boolean save(User user) {
		return  userDao.save(user);
	}

}
