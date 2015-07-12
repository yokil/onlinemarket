package net.sombra.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.sombra.form.User;
import net.sombra.service.UserService;
@Controller
//@RequestMapping("/Users")
public class UserController {
	
	 @Autowired
	UserService userService;
	 
	 @RequestMapping("/index")
	    public String listUsers(Map<String, Object> map) {
	 
	        map.put("user", new User());
	        map.put("usersList", userService.getList());
	 
	        return "user";//jsp
	    }
	    @RequestMapping("/")
	    public String redirect() {
	 
	        return "redirect:/index";
	    }
	    @RequestMapping(value = "/add", method = RequestMethod.POST)
	    public String add(@ModelAttribute("user")
	    User user, BindingResult result) {
	 
	        userService.add(user);
	 
	        return "redirect:/index";
	    }
	 
	    @RequestMapping("/delete/{Id}")
	    public String delete(@PathVariable("Id")
	    Integer id) {
	 
	        userService.remove(id);
	 
	        return "redirect:/index";
	    }
}
