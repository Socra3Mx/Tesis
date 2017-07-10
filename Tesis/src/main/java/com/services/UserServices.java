package com.services;

import java.util.List;
import com.entities.Login;
import com.entities.Users;

public interface UserServices {
	public List<Users>  UserList();
	public boolean disable (Users users);
	public boolean save (Users users);
	void register(Users user);
	Users validateUser(Login login);

}
