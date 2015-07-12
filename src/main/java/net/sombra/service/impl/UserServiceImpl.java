package net.sombra.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sombra.dao.UserDAO;
import net.sombra.form.User;
import net.sombra.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	 @Autowired
	private UserDAO userDAO;
	 
	public void add(User user) {
		
		userDAO.add(user);
	}

	public List<User> getList() {
	
		return userDAO.getList();
	}

	public void remove(Integer id) {
		
		userDAO.remove(id);
	}

}
