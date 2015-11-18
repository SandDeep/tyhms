package com.techyolk.hms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login.html")
public class LoginController {

	//private Log log = LogFactory.getLog(getClass());
	private static final Logger logger = Logger.getLogger(LoginController.class);

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showForm(HttpServletRequest request, HttpServletResponse response) {
		logger.info("In Login Controller");
		return new ModelAndView("index");
	}
}
