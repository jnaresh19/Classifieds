package com.innovationfollowers.classifieds.rest.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.innovationfollowers.classifieds.rest.dao.UserInfoDao;
import com.innovationfollowers.classifieds.rest.dao.UserInfoEntity;
import com.innovationfollowers.classifieds.rest.errorhandling.AppException;
import com.innovationfollowers.classifieds.rest.resource.UserInfo;

public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public Long addUserInfo(UserInfo userInfo) throws AppException {
		return userInfoDao.addUserInfo(new UserInfoEntity(userInfo));
	}


	@Override
	public UserInfo getUserInfo(Long userId) throws AppException {
		UserInfoEntity userInfo = userInfoDao.getUserInfo(userId);
		return new UserInfo(userInfo);
	}
	
	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

}
