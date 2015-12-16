package com.innovationfollowers.classifieds.rest.resource;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.beanutils.BeanUtils;

import com.innovationfollowers.classifieds.rest.dao.CityEntity;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class City implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5738372132669994335L;

	@XmlElement(name = "city_id")	
	private Long id;
	
	@XmlElement(name = "city_name")	
	private String cityName;
	
	@XmlElement(name = "state_id")	
	private Long stateId;
	
	public City() {
	}
	
	public City(CityEntity cityEntity)
	{
		try {
			BeanUtils.copyProperties(this, cityEntity);
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

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}
	
	

}
