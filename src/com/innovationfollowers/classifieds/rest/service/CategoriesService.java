package com.innovationfollowers.classifieds.rest.service;

import java.util.List;

import com.innovationfollowers.classifieds.rest.errorhandling.AppException;
import com.innovationfollowers.classifieds.rest.resource.Categories;

public interface CategoriesService {

	public List<Categories> getAllCategories() throws AppException;
	
	public Long addCategory(String categoryName) throws AppException;
}
