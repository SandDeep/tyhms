package com.techyolk.hms.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class User implements Serializable {

	private static final long serialVersionUID = 5795237181164280353L;

	private int id;

	@NotNull
	private String username;
	@NotNull
	private String password;
	
	private int groupId;
	private String remarks;
	private int status;
	
	@NotNull
	private String primaryEmail;
	private String secondaryEmail;
	private String primaryCell;
	private String secondaryCell;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

	public String getPrimaryCell() {
		return primaryCell;
	}

	public void setPrimaryCell(String primaryCell) {
		this.primaryCell = primaryCell;
	}

	public String getSecondaryCell() {
		return secondaryCell;
	}

	public void setSecondaryCell(String secondaryCell) {
		this.secondaryCell = secondaryCell;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", groupId=" + groupId + ", remarks=" + remarks + ", status="
				+ status + ", primaryEmail=" + primaryEmail
				+ ", secondaryEmail=" + secondaryEmail + ", primaryCell="
				+ primaryCell + ", secondaryCell=" + secondaryCell + "]";
	}

}
