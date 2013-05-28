package se.jorgen.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import se.jorgen.entity.User;
import se.jorgen.service.UserService;

@Controller("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @RequestMapping
    public ModelAndView showAll(Model model) {
	ModelAndView mav = new ModelAndView("users");
	List<User> list = userService.findAll();
	mav.addObject("users", list);

	return mav;
    }
}