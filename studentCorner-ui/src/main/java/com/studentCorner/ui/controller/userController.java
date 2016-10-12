/*package com.blackbox.ids.ui.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

*//**
 * Handles and retrieves the login or denied page depending on the URI template
 *//*
@Controller
public class userController {

	//protected static Logger logger = Logger.getLogger(userController.class);
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginPage(HttpServletRequest request,
			@RequestParam(value = "error", required = false) String error, ModelMap model) {
		//logger.debug("Received request to show login page");
		
		return "login";
	}
}*/