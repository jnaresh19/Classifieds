package com.innovationfollowers.classifieds.rest.dao;

import com.innovationfollowers.classifieds.rest.errorhandling.AppException;

public interface UserInfoDao {

	public Long addUserInfo(UserInfoEntity userInfo) throws AppException;
	
	public UserInfoEntity getUserInfo(Long id) throws AppException;
}
