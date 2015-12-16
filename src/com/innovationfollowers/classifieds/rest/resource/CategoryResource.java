package com.innovationfollowers.classifieds.rest.resource;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.innovationfollowers.classifieds.rest.errorhandling.AppException;
import com.innovationfollowers.classifieds.rest.service.CategoriesService;

@Component
@Path("/categories")
public class CategoryResource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3791521300234321541L;

	@Autowired
	private CategoriesService categoryService;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Categories> getAllCategories() throws IOException, AppException {
		return categoryService.getAllCategories();
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response addCategory(Categories category) throws IOException,
			AppException {
		Long id = categoryService.addCategory(category.getCategoryName());
		category.setId(id);
		return Response.status(200).entity(category).build();
	}
	
	
	public void setCityService(CategoriesService categoryService) {
		this.categoryService = categoryService;
	}

}
