package com.tpoint.service;

import com.tpoint.pojo.LoginDetailsPojo;
import com.tpoint.pojo.LoginResponsePojo;

public interface GetData {
	
	public LoginResponsePojo Logindetails(LoginDetailsPojo loginDetailsPojo);

}
