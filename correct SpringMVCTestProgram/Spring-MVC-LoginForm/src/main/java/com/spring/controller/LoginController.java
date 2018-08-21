package com.spring.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*@Controller
public class LoginController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("msg", "Please Enter Your Login Details");
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("loginBean") LoginBean loginBean) {
		if (loginBean != null && loginBean.getUserName() != null & loginBean.getPassword() != null) {
			if (loginBean.getUserName().equals("Swagata") && loginBean.getPassword().equals("swagata123")) {
				model.addAttribute("msg", loginBean.getUserName());
				return "success";
			} else {
				model.addAttribute("error", "Invalid Details");
				return "login";
			}
		} else {
			model.addAttribute("error", "Please enter Details");
			return "login";
		}
	}*/
//}




@Controller
public class LoginController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String init(Model model) {
		model.addAttribute("msg", "Please Enter Your Login Details");
		return "login";
	}

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("userForm") LoginBean userForm,
            BindingResult result, Map<String, Object> model) {
 
        if (result.hasErrors()) {
            return "login";
        }
 
        return "success";
    }
}
