package com.innovationfollowers.classifieds.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.innovationfollowers.classifieds.rest.dao.AreaDao;
import com.innovationfollowers.classifieds.rest.dao.AreaEntity;
import com.innovationfollowers.classifieds.rest.errorhandling.AppException;
import com.innovationfollowers.classifieds.rest.resource.Area;

public class AreaServiceImpl implements AreaService {

	@Autowired
	private AreaDao areaDao;

	@Override
	public List<Area> getAllAreasOfCity(Long cityId) throws AppException {

		List<AreaEntity> allAreasOfCity = areaDao.getAllAreasOfCity(cityId);
		List<Area> areas = convertAreaEntityToArea(allAreasOfCity);
		return areas;
	}

	private List<Area> convertAreaEntityToArea(List<AreaEntity> allAreasOfCity) {

		List<Area> areas = new ArrayList<Area>();
		for (AreaEntity areaEntity : allAreasOfCity) {
			areas.add(new Area(areaEntity));
		}
		return areas;
	}

	public void setAreaDao(AreaDao areaDao) {
		this.areaDao = areaDao;
	}

}
