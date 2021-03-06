package com.sonata.controller;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LoginUserController {
	@RequestMapping(method=RequestMethod.GET)
	public String showLoginForm(Model model)
	{
		User user=new User();
		model.addAttribute("user",user);
		return "login";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String showLoginForm(@Valid User user,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "login";
		}
		return "home";
	}
}