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
import com.innovationfollowers.classifieds.rest.service.AreaService;

@Component
@Path("/areas")
public class AreaResource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3791521300234321541L;

	@Autowired
	private AreaService areaService;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Area> getAllAreasOfCity(@QueryParam("cityId") Long cityId)
			throws IOException, AppException {
		return areaService.getAllAreasOfCity(cityId);
	}

	public void setCityService(AreaService areaService) {
		this.areaService = areaService;
	}

}
