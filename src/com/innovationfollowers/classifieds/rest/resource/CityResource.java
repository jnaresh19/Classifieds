package com.innovationfollowers.classifieds.rest.resource;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.innovationfollowers.classifieds.rest.errorhandling.AppException;
import com.innovationfollowers.classifieds.rest.service.CityService;

@Component
@Path("/cities")
public class CityResource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3791521300234321541L;

	@Autowired
	private CityService cityService;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<City> getCities(@QueryParam("stateId") Long stateId)
			throws IOException, AppException {
		if (null == stateId) {
			return cityService.getAllCities();
		} else {
			return cityService.getAllCitiesOfState(stateId);
		}
	}

	public void setCityService(CityService cityService) {
		this.cityService = cityService;
	}

}
