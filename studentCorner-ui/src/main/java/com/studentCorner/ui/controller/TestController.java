package com.studentCorner.ui.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class TestController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginPage(HttpServletRequest request,
			@RequestParam(value = "error", required = false) String error, ModelMap model) {
		//logger.debug("Received request to show login page");
		
		return "login";
	}
}
