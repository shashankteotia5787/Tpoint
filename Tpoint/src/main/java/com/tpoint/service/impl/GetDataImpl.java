package com.tpoint.service.impl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
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
		ObjectMapper ob= new ObjectMapper();
		LoginResponsePojo loginResponsePojo = new LoginResponsePojo();
		LoginDetails loginDetails = new LoginDetails();
		loginDetails.setLoginId(loginDetailsPojo.getUserName());
		loginDetails.setPassword(loginDetailsPojo.getPassword());
		loginDetails.setName(loginDetailsPojo.getName());
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
