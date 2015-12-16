package com.innovationfollowers.classifieds.rest.service;

import com.innovationfollowers.classifieds.rest.errorhandling.AppException;
import com.innovationfollowers.classifieds.rest.resource.UserInfo;

public interface UserInfoService {

	public Long addUserInfo(UserInfo userInfo) throws AppException;
	
	public UserInfo getUserInfo(Long userId) throws AppException;
}
