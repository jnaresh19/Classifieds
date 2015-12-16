package com.innovationfollowers.classifieds.rest.resource;

import java.io.IOException;
import java.io.Serializable;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.innovationfollowers.classifieds.rest.errorhandling.AppException;
import com.innovationfollowers.classifieds.rest.service.UserInfoService;

@Component
@Path("/userinfo")
public class UserInfoResource implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8766820414288756240L;
	
	@Autowired
	private UserInfoService userInfoService;
	
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public UserInfo getUserInfo(@QueryParam("userId") Long userId) throws IOException, AppException {
		return userInfoService.getUserInfo(userId);
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response addUserInfo(UserInfo userInfo) throws IOException,
			AppException {
		Long id = userInfoService.addUserInfo(userInfo);
		
		UserInfo info = new UserInfo();
		info.setId(id);
		
		return Response.status(200).entity(info).build();
	}
	

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

}
