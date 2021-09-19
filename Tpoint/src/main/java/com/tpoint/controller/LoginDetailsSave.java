package com.tpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tpoint.pojo.LoginDetailsPojo;
import com.tpoint.pojo.LoginResponsePojo;
import com.tpoint.service.GetData;

@RestController
@RequestMapping("/login")
public class LoginDetailsSave {

	@Autowired
	private GetData getData;

	@PostMapping("/insert")
	public LoginResponsePojo loginDetailsSave(@RequestBody LoginDetailsPojo loginDetailsPojo) {

		return getData.Logindetails(loginDetailsPojo);

	}

}
