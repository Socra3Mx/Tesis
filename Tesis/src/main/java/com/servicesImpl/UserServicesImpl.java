package com.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.entities.Login;
import com.entities.Users;
import com.services.UserServices;

@Service
public class UserServicesImpl implements  UserServices {

	@Autowired
	UserDao userDao;
	
	public List<Users> UserList() {
		// TODO Auto-generated method stub
		return userDao.UserList();
	}

	public boolean disable(Users users) {
		// TODO Auto-generated method stub
		return userDao.disable(users);
	}

	public boolean save(Users users) {
		// TODO Auto-generated method stub
		return userDao.save(users);
	}

	public void register(Users user) {
		// TODO Auto-generated method stub
		
	}

	public Users validateUser(Login login) {
		// TODO Auto-generated method stub
		return userDao.validateUser(login);
	}

	
}
