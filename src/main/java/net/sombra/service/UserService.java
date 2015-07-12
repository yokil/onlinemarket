package net.sombra.service;

import java.util.List;

import net.sombra.form.User;

public interface UserService {
	  
    public void add(User user);
    public List<User> getList();
    public void remove(Integer id);
}
