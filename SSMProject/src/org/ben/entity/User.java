package org.ben.entity;

public class User {
	private String uname;
	private String upwd;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", upwd=" + upwd + "]";
	}
	public User(String uname, String upwd) {
		
		this.uname = uname;
		this.upwd = upwd;
	}
	public User() {
		
	}
public User(String uname) {
		
		this.uname = uname;
	
	}
	
}
