package com.innovationfollowers.classifieds.rest.resource;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.beanutils.BeanUtils;

import com.innovationfollowers.classifieds.rest.dao.AreaEntity;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Area implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5467504759801192471L;


	@XmlElement(name="area_id")
	private Long id;
	
	@XmlElement(name="area_name")
	private String areaName;
	
	@XmlElement(name="city_id")
	private Long cityId;

	public Area()
	{
		
	}
	
	public Area(AreaEntity areaEntity)
	{
		try {
			BeanUtils.copyProperties(this, areaEntity);
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

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
}
