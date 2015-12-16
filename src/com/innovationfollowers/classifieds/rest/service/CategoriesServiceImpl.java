package com.innovationfollowers.classifieds.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.innovationfollowers.classifieds.rest.dao.CategoriesDao;
import com.innovationfollowers.classifieds.rest.dao.CategoriesEntity;
import com.innovationfollowers.classifieds.rest.errorhandling.AppException;
import com.innovationfollowers.classifieds.rest.resource.Categories;

public class CategoriesServiceImpl implements CategoriesService {

	@Autowired
	private CategoriesDao categoryDao;

	@Override
	public List<Categories> getAllCategories() throws AppException {
		return convertCategoryEntityToCategory(categoryDao.getAllCategories());
	}

	@Override
	public Long addCategory(String categoryName) throws AppException {
		return categoryDao.addCategory(categoryName);
	}

	public void setCategoryDao(CategoriesDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	private List<Categories> convertCategoryEntityToCategory(
			List<CategoriesEntity> categoryEntities) {
		List<Categories> categories = new ArrayList<Categories>();
		for (CategoriesEntity categoriesEntity : categoryEntities) {
			categories.add(new Categories(categoriesEntity));
		}
		return categories;
	}

}
