package com.techyolk.hms.util;

public class Config {

	
	public static int ADMIN_GROUP = 1;
	
	public static boolean chkNull(String text) {
		if (text != null && !text.trim().equals("")
				&& !text.equals("undefined")) {
			return false;
		}
		return true;
	}
}
