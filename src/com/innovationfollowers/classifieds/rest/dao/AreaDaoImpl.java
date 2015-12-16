package com.innovationfollowers.classifieds.rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.innovationfollowers.classifieds.rest.errorhandling.AppException;

public class AreaDaoImpl implements AreaDao{

	
	@PersistenceContext(unitName="restPersistence")
	private EntityManager entityManager;

	
	@Override
	public List<AreaEntity> getAllAreasOfCity(Long cityId) throws AppException {
		String sqlString = "SELECT a FROM AreaEntity a where a.cityId = ?1" + " ORDER BY a.areaName";
		TypedQuery<AreaEntity> query = entityManager.createQuery(sqlString, AreaEntity.class);
		query.setParameter(1, cityId);
		return query.getResultList();
	}

}
