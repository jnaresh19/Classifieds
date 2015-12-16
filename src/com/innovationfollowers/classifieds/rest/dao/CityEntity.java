package com.innovationfollowers.classifieds.rest.dao;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.beanutils.BeanUtils;

import com.innovationfollowers.classifieds.rest.resource.City;

@Entity
@Table(name="cities")
public class CityEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6520705801743803118L;
	
	/** id of the podcast */
	@Id
	@GeneratedValue
	@Column(name="city_id")
	private Long id;
	
	/** title of the podcast */
	@Column(name="city_name")
	private String cityName;
		
	/** link of the podcast on Podcastpedia.org */
	@Column(name="state_id")
	private Long stateId;
	
	public CityEntity() {
	}
	
	public CityEntity(City city)
	{
		try {
			BeanUtils.copyProperties(this, city);
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
	

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	

}
