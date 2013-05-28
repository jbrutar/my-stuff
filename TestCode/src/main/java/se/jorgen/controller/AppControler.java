package se.jorgen.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import se.jorgen.service.UserService;

@Controller
public class AppControler {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public ModelAndView search(Model model) {
	System.err.println("Controller search");
	ModelAndView mav = new ModelAndView("users");
	List<String> list = userService.findInDb();
	mav.addObject(list);

	return mav;
    }
}