package com.jyd.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jyd.dao.UserDao;
import com.jyd.vo.User;
/**
 * @Repository("userDao") 相当于配置文件中 
 * <bean id="userDao" class="com.jyd.dao.impl.UserDaoImpl">
 * @Repository如果不指定名称 默认为类名的首字母小写
 * 
 **/
@Repository(value="userDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public List<User> list() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	@Override
	public boolean save(User user) {
		try {
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false; 
		}
	}

}
