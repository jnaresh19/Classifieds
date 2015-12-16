package com.innovationfollowers.classifieds.rest.dao;

import java.util.List;

import com.innovationfollowers.classifieds.rest.errorhandling.AppException;

public interface CategoriesDao {

	public List<CategoriesEntity> getAllCategories() throws AppException;
	
	public Long addCategory(String categoryName) throws AppException;
}
