package com.innovationfollowers.classifieds.rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

import com.innovationfollowers.classifieds.rest.errorhandling.AppException;

public class CategoriesDaoImpl implements CategoriesDao {

	@PersistenceContext(unitName = "restPersistence")
	private EntityManager entityManager;

	@Override
	public List<CategoriesEntity> getAllCategories() throws AppException {
		String sqlString = "SELECT c FROM CategoriesEntity c"
				+ " ORDER BY c.categoryName";
		TypedQuery<CategoriesEntity> query = entityManager.createQuery(
				sqlString, CategoriesEntity.class);

		return query.getResultList();
	}

	@Transactional("transactionManager")
	@Override
	public Long addCategory(String categoryName) throws AppException {
		CategoriesEntity entity = new CategoriesEntity();
		entity.setCategoryName(categoryName);
		CategoriesEntity merge = entityManager.merge(entity);
		entityManager.flush();

		return merge.getId();
	}

}
