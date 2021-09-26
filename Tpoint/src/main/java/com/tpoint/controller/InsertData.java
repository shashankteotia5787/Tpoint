package com.tpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tpoint.entity.Title;
import com.tpoint.repository.TitleRepo;

@RestController
public class InsertData {
	
	@Autowired
	private TitleRepo titlerepo;
	
	@PostMapping("/insert")
	public String insertIntoDatabase(@RequestBody Title title)
	{
		Title tiltle=new Title();
		try {
			titlerepo.save(title);
		} catch (Exception e) {
			return "not Saved";
		}
		return "saved";
	}
	

}
