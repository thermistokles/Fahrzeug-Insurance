package com.controller;

import java.io.IOException;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Users;
import com.service.UsersService;

public class UsersController {
	private static final Logger logger = Logger.getLogger(UsersController.class);
	
	public UsersController() {
        System.out.println("UsersController()");
    }
	
	@Autowired
    private UsersService usersService;
    
    @RequestMapping(value = "/")
    public ModelAndView listUsers(ModelAndView model) throws IOException {
        List<Users> listUsers = usersService.getAllUsers();
        model.addObject("listUsers", listUsers);
        model.setViewName("home");
        return model;
    }
    
    @RequestMapping(value = "/newUsers", method = RequestMethod.GET)
    public ModelAndView newContact(ModelAndView model) {
        Users users = new Users();
        model.addObject("users", users);
        model.setViewName("UsersForm");
        return model;
    }
    
    @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
    public ModelAndView saveEmployee(@ModelAttribute Users users) {
        if (users.getId() == 0) { // if employee id is 0 then creating the
            // employee other updating the employee
            usersService.addUsers(users);
        } else {
            usersService.updateUsers(users);
        }
        return new ModelAndView("redirect:/");
    }
}
