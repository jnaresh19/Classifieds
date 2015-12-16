package com.innovationfollowers.classifieds.rest.dao;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.beanutils.BeanUtils;

import com.innovationfollowers.classifieds.rest.resource.Area;

@Entity
@Table(name="area")
public class AreaEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5467504759801192471L;

	@Id
	@GeneratedValue
	@Column(name="area_id")
	private Long id;
	
	@Column(name="area_name")
	private String areaName;
	
	@Column(name="city_id")
	private Long cityId;

	public AreaEntity()
	{
		
	}
	
	public AreaEntity(Area area)
	{
		try {
			BeanUtils.copyProperties(this, area);
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
