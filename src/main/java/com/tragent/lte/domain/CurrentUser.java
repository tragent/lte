package com.tragent.lte.domain;

public class CurrentUser {
	private AppUser appUser;
	private String token;

	public CurrentUser(AppUser appUser, String token) {
		super();
		this.appUser = appUser;
		this.token = token;
	}

	public AppUser getUser() {
		return this.appUser;
	}

	public void setUser(AppUser appUser) {
		this.appUser = appUser;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
