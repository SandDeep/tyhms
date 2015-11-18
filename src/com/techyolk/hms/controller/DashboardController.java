package com.techyolk.hms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.techyolk.hms.model.User;
import com.techyolk.hms.service.IMashupService;
import com.techyolk.hms.util.Config;

@Controller
@RequestMapping("/dashboard.html")
public class DashboardController {

	private Log log = LogFactory.getLog(DashboardController.class);

	@Autowired
	IMashupService mashupService;

	// @Valid @ModelAttribute("username") User user,BindingResult result,
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView showForm(@ModelAttribute("username") User user,
			HttpServletRequest request, HttpServletResponse response) {
		log.debug("In Dashboard Controller : " + user);

		if (Config.chkNull(user.getUsername())) {
			log.debug("Invalid UserName");
			return new ModelAndView("404-error");
		}

		if (Config.chkNull(user.getPassword())) {
			log.debug("Invalid Password");
			return new ModelAndView("404-error");
		}

		String responsePage = mashupService.validateUser(user);

		HttpSession session = request.getSession(true);
		session.setAttribute("UserName", user.getUsername());
		session.setAttribute("UserId", user.getId());
		session.setAttribute("IsLoggedIn", true);

		return new ModelAndView(responsePage);
	}
}
