package com.innovationfollowers.classifieds.rest.dao;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.beanutils.BeanUtils;

import com.innovationfollowers.classifieds.rest.resource.BusinessDetails;

@Entity
@Table(name = "business_details")
public class BusinessDetailsEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6019342193731800318L;

	@Id
	@GeneratedValue
	@Column(name = "business_id")
	private Long id;
	
	@Column(name = "business_name")
	private String businessName;
	
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "category_id")
	private Long categoryId;
	
	@Column(name = "city_id")
	private Long cityId;
	
	@Column(name = "area_id")
	private Long areaId;
	
	@Column(name = "address")
	private String address;
	
	public BusinessDetailsEntity() {
		// TODO Auto-generated constructor stub
	}

	public BusinessDetailsEntity(BusinessDetails businessDetails)
	{
		try {
			BeanUtils.copyProperties(this, businessDetails);
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

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
