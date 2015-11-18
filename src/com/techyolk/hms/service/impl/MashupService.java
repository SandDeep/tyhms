package com.techyolk.hms.service.impl;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.techyolk.hms.model.User;
import com.techyolk.hms.service.IMashupService;
import com.techyolk.hms.service.UserService;
import com.techyolk.hms.util.Config;

@Component("mashupService")
public class MashupService implements IMashupService {

	private Log log = LogFactory.getLog(IMashupService.class);

	@Resource(name = "userService")
	UserService userService;

	@Override
	public String validateUser(User user) {

		User dbUser = userService.getUserByName(user.getUsername());

		// Null User
		if (dbUser == null) {
			log.info("User Doesn't Exist.");
			return "404-error";
		}

		if (user.getPassword().equals(dbUser.getPassword())) {

			if (dbUser.getGroupId() == Config.ADMIN_GROUP) {
				log.debug("Admin User Group.");
				return "registration";
			} else {
				return "userPanel";
			}

		} else {
			log.debug("Password Doesn't Match");
			return "404-error";
		}

	}

}
