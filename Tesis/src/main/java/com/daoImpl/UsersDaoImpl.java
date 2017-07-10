package com.daoImpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.entities.Login;
import com.entities.Users;


@Repository
@Transactional
public class UsersDaoImpl implements UserDao{

	
	 @Autowired
	 SessionFactory session;
	 
	public List<Users> UserList() {
		  return session.getCurrentSession().createQuery("from Users").list();
		 
	}

	public boolean disable(Users users) {
		try {
            session.getCurrentSession().delete(users);
        } catch (Exception ex) {
            return false;
        }
 
        return true;
       
	}

	public boolean save(Users users) {
		 // TODO Auto-generated method stub
        session.getCurrentSession().saveOrUpdate(users);
        return true;
	}

	public void register(Users user) {
		 // TODO Auto-generated method stub
        session.getCurrentSession().saveOrUpdate(user);
     
		
	}

	public Users validateUser(Login login) {
		System.out.println("Username " +login.getUsername());
		System.out.println("Pass " +login.getPassword());
		String query = "from Users where username= '"+ login.getUsername()+"'  and password='"+ login.getPassword()+ "' ";
		System.out.println(query);
		 List  usr;
		usr = session.getCurrentSession().createQuery(query).list(); 			 
		    return (Users) (usr.size() > 0 ? usr.get(0) : null);
	}


}
