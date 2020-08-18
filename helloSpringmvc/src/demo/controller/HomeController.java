package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.entity.User;
import demo.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
	public String index(Model model) {
		List<User> users = userService.findAll();
		model.addAttribute("users", users);
		return "index";
	}
	
	@RequestMapping(value = {"/add"}, method = RequestMethod.GET)
	public String addGET(Model model) {
		model.addAttribute("user", new User());
		return "add";
	}
	
	@RequestMapping(value = {"/add"}, method = RequestMethod.POST)
	public String addPOST(@ModelAttribute("user") User user, Model model) {
		userService.save(user);
		return "redirect:/";
	}
}
