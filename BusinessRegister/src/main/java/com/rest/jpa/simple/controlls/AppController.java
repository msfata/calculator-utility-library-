package com.rest.jpa.simple.controlls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rest.jpa.simple.entities.Business;
import com.rest.jpa.simple.service.AppService;

@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	private AppService service;
	private String error = "error";
	private String show = "show";
	private String index = "index";

	@RequestMapping("/index")
	public String home() {
		return "index";
	}

	@RequestMapping(value = { "/GOTOREGISTERPAGE" }, method = RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("Business", new Business());
		modelAndView.setViewName("register");
		return modelAndView;
	}

	@GetMapping("/SHOW")
	public String show(@ModelAttribute("Business") Business business, BindingResult result, ModelMap model) {
		List<Business> list = service.readAll();
		model.addAttribute("list", list);
		return show;
	}

	@PostMapping(value = "/REGISTERRECORD")
	public String submit(@ModelAttribute("Business") Business business, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return error;
		}
		if (business.getBusinessName().isEmpty() || business.getBusinessType().isEmpty()
				||business.getBusinessTurnover().isEmpty() || business.getBusinessContact().isEmpty()) {
			return index;
		}
		service.saveRecord(business);
		return index;
	}

}
