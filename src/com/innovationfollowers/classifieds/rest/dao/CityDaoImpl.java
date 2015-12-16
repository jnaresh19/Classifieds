package com.innovationfollowers.classifieds.rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public class CityDaoImpl implements CityDao{
	
	@PersistenceContext(unitName="restPersistence")
	private EntityManager entityManager;

	@Override
	public List<CityEntity> getAllCities() {
		String sqlString = "SELECT c FROM CityEntity c" + " ORDER BY c.cityName";
		TypedQuery<CityEntity> query = entityManager.createQuery(sqlString, CityEntity.class);		

		return query.getResultList();
	}

	@Override
	public List<CityEntity> getAllCitiesOfState(Long stateId) {
		String sqlString = "SELECT c FROM CityEntity c where c.stateId = ?1" + " ORDER BY c.cityName";
		TypedQuery<CityEntity> query = entityManager.createQuery(sqlString, CityEntity.class);
		query.setParameter(1, stateId);
		return query.getResultList();
	}

}
