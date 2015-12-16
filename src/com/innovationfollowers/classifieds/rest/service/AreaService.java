package com.innovationfollowers.classifieds.rest.service;

import java.util.List;

import com.innovationfollowers.classifieds.rest.errorhandling.AppException;
import com.innovationfollowers.classifieds.rest.resource.Area;

public interface AreaService {

	public List<Area> getAllAreasOfCity(Long cityId) throws AppException;
}
