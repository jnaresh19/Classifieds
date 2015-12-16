package com.innovationfollowers.classifieds.rest.dao;

import java.util.List;

import com.innovationfollowers.classifieds.rest.errorhandling.AppException;

public interface CityDao {

	public List<CityEntity> getAllCities() throws AppException;
	
	public List<CityEntity> getAllCitiesOfState(Long stateId) throws AppException;
	
}
