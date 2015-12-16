package com.innovationfollowers.classifieds.rest.resource;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.innovationfollowers.classifieds.rest.errorhandling.AppException;
import com.innovationfollowers.classifieds.rest.service.BusinessDetailsService;

@Component
@Path("/businessdetails")
public class BusinessDetailsResource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8766820414288756240L;

	@Autowired
	private BusinessDetailsService businessDetailsService;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<BusinessDetails> getBusinessDetails(
			@QueryParam("businessId") Long businessId) throws IOException,
			AppException {

		if (null == businessId) {
			return businessDetailsService.getAllBusinessDetails();
		} else {
			BusinessDetails businessDetails = businessDetailsService
					.getBusinessDetails(businessId);
			List<BusinessDetails> details = new ArrayList<BusinessDetails>();
			details.add(businessDetails);

			return details;
		}
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response addBusinessDetails(BusinessDetails businessDetails)
			throws IOException, AppException {
		Long id = businessDetailsService.addBusinessDetails(businessDetails);
		BusinessDetails details = new BusinessDetails();
		details.setId(id);
		return Response.status(200).entity(details).build();
	}

	public void setBusinessDetailsService(
			BusinessDetailsService businessDetailsService) {
		this.businessDetailsService = businessDetailsService;
	}

}
