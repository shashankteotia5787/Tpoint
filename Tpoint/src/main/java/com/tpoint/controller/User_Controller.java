package com.tpoint.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tpoint.entity.User;
import com.tpoint.repository.UserRepository;
import com.tpoint.userStatus.Status;

@RestController
public class User_Controller {
	@Autowired
	UserRepository repository;

	@PostMapping("/user/register")
	public Status registerUser(@Valid @RequestBody User newUser) {
		List<User> users = repository.findAll();
		System.out.println("New User: " + newUser.toString());

		for (User user : users) {
			if (user.equals(newUser)) {
				System.out.println("USER_ALREADY_EXISTS");
				return Status.USER_AREADY_EXISTS;
			}
		}

		repository.save(newUser);
		System.out.println("SUCCESS");
		return Status.SUCCESS;
	}

	@PostMapping("/user/login")
	public Status loginUser(@Valid @RequestBody User user) {
		List<User> users = repository.findAll();
		for (User user1 : users) {
			if (user1.equals(user)) {
				user.setLoggedIn(true);
				repository.save(user);
				return Status.SUCCESS;
			}
		}
		return Status.FAILURE;
	}

	@PostMapping("user/logout")
	public Status logUserOut(@Valid @RequestBody User user) {
		List<User> users = repository.findAll();
		for (User user2 : users) {
			if (user2.equals(user)) {
				user.setLoggedIn(false);
				repository.save(user);
				return Status.SUCCESS;
			}
		}
		return Status.FAILURE;
	}
}
