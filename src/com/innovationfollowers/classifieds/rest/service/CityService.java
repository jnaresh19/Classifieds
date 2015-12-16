package com.innovationfollowers.classifieds.rest.service;

import java.util.List;



import com.innovationfollowers.classifieds.rest.errorhandling.AppException;
import com.innovationfollowers.classifieds.rest.resource.City;

public interface CityService {

	public List<City> getAllCities() throws AppException;
	
	public List<City> getAllCitiesOfState(Long stateId) throws AppException;
}
