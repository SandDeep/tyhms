package com.techyolk.hms.model;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 617682895356554488L;

	private int customerId;
	private String customerName;
	private String address;
	private String country;
	private int state;
	private String contactName;
	private String primaryEmail;
	private String secondaryEmail;
	private String logoLocation;
}
