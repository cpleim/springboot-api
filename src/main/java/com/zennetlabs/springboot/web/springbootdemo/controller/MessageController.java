package com.zennetlabs.springboot.web.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {

	@RequestMapping("/message")
	public String showMessage(@RequestParam String msg, ModelMap model) {
		model.put("msg", msg);
		return "message";
	}

}
