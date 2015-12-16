package com.innovationfollowers.classifieds.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.innovationfollowers.classifieds.rest.dao.CityDao;
import com.innovationfollowers.classifieds.rest.dao.CityEntity;
import com.innovationfollowers.classifieds.rest.errorhandling.AppException;
import com.innovationfollowers.classifieds.rest.resource.City;

public class CityServiceImpl implements CityService {

	@Autowired
	private CityDao cityDao;

	@Override
	public List<City> getAllCities() throws AppException {

		List<CityEntity> allCities = cityDao.getAllCities();
		return convertCityEntitiesToCity(allCities);
	}

	private List<City> convertCityEntitiesToCity(List<CityEntity> allCities) {

		List<City> cities = new ArrayList<City>(2);
		for (CityEntity cityEntity : allCities) {
			cities.add(new City(cityEntity));
		}
		return cities;
	}

	public void setCityDao(CityDao cityDao) {
		this.cityDao = cityDao;
	}

	@Override
	public List<City> getAllCitiesOfState(Long stateId) throws AppException {
		List<CityEntity> allCities = cityDao.getAllCitiesOfState(stateId);
		return convertCityEntitiesToCity(allCities);
	}

}
