package com.innovationfollowers.classifieds.rest.resource;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.beanutils.BeanUtils;

import com.innovationfollowers.classifieds.rest.dao.BusinessDetailsEntity;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BusinessDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6019342193731800318L;

	@XmlElement(name = "business_id")
	private Long id;
	
	@XmlElement(name = "business_name")
	private String businessName;
	
	@XmlElement(name = "user_id")
	private Long userId;
	
	@XmlElement(name = "category_id")
	private Long categoryId;
	
	@XmlElement(name = "city_id")
	private Long cityId;
	
	@XmlElement(name = "area_id")
	private Long areaId;
	
	@XmlElement(name = "address")
	private String address;
	
	public BusinessDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public BusinessDetails(BusinessDetailsEntity businessDetailsEntity)
	{
		try {
			BeanUtils.copyProperties(this, businessDetailsEntity);
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
