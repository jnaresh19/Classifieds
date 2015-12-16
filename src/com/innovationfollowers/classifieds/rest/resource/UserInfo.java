package com.innovationfollowers.classifieds.rest.resource;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.beanutils.BeanUtils;

import com.innovationfollowers.classifieds.rest.dao.UserInfoEntity;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UserInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9088498290402492204L;
	
	@XmlElement(name="user_id")
	private Long id;
	
	@XmlElement(name="email_id")
	private String emailId;
	
	@XmlElement(name="phone_no")
	private String phoneNo;
	
	@XmlElement(name="password")
	private String password;
	
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public UserInfo(UserInfoEntity userInfoEntity)
	{
		try {
			BeanUtils.copyProperties(this, userInfoEntity);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
