package com.it.models;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonFormat;

public class UserProfileModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotEmpty(message = "username NotEmpty")
	private String username;

	@NotEmpty(message = "firstname NotEmpty")
	private String firstname;

	@NotEmpty(message = "lastname NotEmpty")
	private String lastname;

	@NotEmpty(message = "sex NotEmpty")
	private String sex;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date birthday;

	@NotEmpty(message = "activityFlag NotEmpty")
	private String activityFlag;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getActivityFlag() {
		return activityFlag;
	}

	public void setActivityFlag(String activityFlag) {
		this.activityFlag = activityFlag;
	}

}
