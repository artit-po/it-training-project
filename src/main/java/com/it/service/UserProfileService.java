package com.it.service;


import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.it.entity.UserProfileEntity;
import com.it.models.UserProfileModel;
import com.it.repository.UserProfileRepository;

@Service
public class UserProfileService {
	
	@Autowired
	private UserProfileRepository userProfileRepository;
	
	public boolean saveUserProfile(UserProfileModel userProfileModel) {
		boolean result = false;
		if(userProfileModel != null) {
			UserProfileEntity entity = new UserProfileEntity();
			entity.setUsername(userProfileModel.getUsername());
			entity.setFirstname(userProfileModel.getFirstname());
			entity.setLastname(userProfileModel.getLastname());
			entity.setBirthday(userProfileModel.getBirthday());
			entity.setActivityFlag(userProfileModel.getActivityFlag());
			entity.setSex(userProfileModel.getSex());
			userProfileRepository.save(entity);
			result = true;
		}
		return result;
	}
	
	public UserProfileModel searchUserProfileByUsername(String username) {
		UserProfileModel response = new UserProfileModel();
		if(StringUtils.isNotBlank(username)) {
			Optional<UserProfileEntity> userProfile = userProfileRepository.findById(username);
			if(userProfile.isPresent()) {
				UserProfileEntity entity = userProfile.get();
				response.setUsername(entity.getUsername());
				response.setFirstname(entity.getFirstname());
				response.setLastname(entity.getLastname());
				response.setBirthday(entity.getBirthday());
				response.setSex(entity.getSex());
				response.setActivityFlag(entity.getActivityFlag());
			}
		}
		return response;
	}
	
	public boolean deleteUserProfileByUsername(String username) {
		boolean result = false;
		if(StringUtils.isNotBlank(username)) {
			userProfileRepository.deleteById(username);
			result = true;
		}
		return result;
	}
	
	
	
}
