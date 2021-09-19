package com.tpoint.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpoint.entity.LoginDetails;
import com.tpoint.pojo.LoginDetailsPojo;
import com.tpoint.pojo.LoginResponsePojo;
import com.tpoint.repository.LoginDetailsRepo;
import com.tpoint.service.GetData;

@Service("login_details_save ")
public class GetDataImpl implements GetData {

	@Autowired
	private LoginDetailsRepo loginDetailsRepo;

	@Override
	public LoginResponsePojo Logindetails(LoginDetailsPojo loginDetailsPojo) {
		LoginResponsePojo loginResponsePojo = new LoginResponsePojo();
		LoginDetails loginDetails = new LoginDetails();
		loginDetails.setLoginId(loginDetailsPojo.getUserName());
		loginDetails.setPassword(loginDetailsPojo.getPassword());
		try {
			loginDetailsRepo.save(loginDetails);
			loginResponsePojo.setSuccess("Details inserted successfully ");
		} catch (Exception e) {
			loginResponsePojo.setFailed("error");
			e.printStackTrace();
		}
		return loginResponsePojo;
	}

}
