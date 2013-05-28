package se.jorgen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import se.jorgen.entity.User;
import se.jorgen.service.UserService;

@Controller("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "get/{userId}", method = RequestMethod.GET)
    public ModelAndView get(@PathVariable int userId, Model model) {
	ModelAndView mav = new ModelAndView("user");
	User user = userService.findById(userId);
	mav.addObject("user", user);

	return mav;
    }
}
