package com.techyolk.hms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.techyolk.hms.model.User;
import com.techyolk.hms.service.UserService;

@Controller
@RequestMapping("/registerUser.html")
public class RegistrationController {

	private Log log = LogFactory.getLog(getClass());
	
	/*@Autowired*/
	@Resource(name="userService")
	UserService userService;

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView userRegister(@ModelAttribute("user") User user,
			HttpServletRequest request, HttpServletResponse response) {
		log.info(user);

		log.info("In Registration Controller");
		user.setStatus(1);
		
		userService.addUser(user);
		
		return new ModelAndView("success");
	}
}
