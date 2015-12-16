package com.innovationfollowers.classifieds.rest.dao;

import java.util.List;

import com.innovationfollowers.classifieds.rest.errorhandling.AppException;

public interface AreaDao {

	public List<AreaEntity> getAllAreasOfCity(Long cityId) throws AppException;
}
