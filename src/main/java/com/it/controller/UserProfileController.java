package com.it.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.models.UserProfileModel;

@RestController
@RequestMapping("/profile-controller")
public class UserProfileController {
 
	@PutMapping("/save")
	public boolean saveUserProfile(@RequestBody UserProfileModel userProfileModel) {
		System.out.println(userProfileModel.getUsername());
		return false;		
	}
}
