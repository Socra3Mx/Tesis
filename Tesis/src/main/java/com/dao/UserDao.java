package com.dao;

import java.util.List;
import com.entities.Users;
import com.entities.Login;

public interface UserDao {
	public List<Users>  UserList();
	public boolean disable (Users users);
	public boolean save (Users users);
	void register(Users user);
	Users validateUser(Login login);

}
