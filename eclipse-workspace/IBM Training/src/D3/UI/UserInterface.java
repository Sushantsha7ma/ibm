package D3.UI;

import java.util.*;
import java.lang.*;
import java.io.*;

public class UserInterface
{ 
	private String userid;
	private String password;
	
	
	public UserInterface(String userid, String password) 
	{
		this.userid=userid;
		this.password=password;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
