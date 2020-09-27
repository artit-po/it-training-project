package com.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.it.models.UserProfileModel;
import com.it.service.UserProfileService;

@RestController
@RequestMapping("/profile-controller")
public class UserProfileController {
	
	@Autowired
	private UserProfileService userProfileService;
 
	@PutMapping("/save")
	public boolean saveUserProfile(@Validated @RequestBody UserProfileModel userProfileModel) {
		return userProfileService.saveUserProfile(userProfileModel);		
	}
	
	@GetMapping("/get-profile")
	public UserProfileModel getUserProfile(
			@RequestParam(name = "username", required = true) String username
			) {
		return userProfileService.searchUserProfileByUsername(username);
	}
	
	@DeleteMapping("/delete-profile")
	public boolean deleteUserProfile(
			@RequestParam(name = "username", required = true) String username
			) {
		return userProfileService.deleteUserProfileByUsername(username);
	}
	
	
}
