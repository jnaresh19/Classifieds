package com.innovationfollowers.classifieds.rest.dao;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.beanutils.BeanUtils;

import com.innovationfollowers.classifieds.rest.resource.UserInfo;

@Entity
@Table(name="userinfo")
public class UserInfoEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9088498290402492204L;
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private Long id;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="phone_no")
	private String phoneNo;
	
	@Column(name="password")
	private String password;
	
	public UserInfoEntity() {
		// TODO Auto-generated constructor stub
	}

	public UserInfoEntity(UserInfo userInfo)
	{
		try {
			BeanUtils.copyProperties(this, userInfo);
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
