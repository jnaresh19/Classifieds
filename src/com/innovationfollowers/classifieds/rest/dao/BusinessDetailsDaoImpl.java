package com.innovationfollowers.classifieds.rest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

import com.innovationfollowers.classifieds.rest.errorhandling.AppException;

public class BusinessDetailsDaoImpl implements BusinessDetailsDao {

	@PersistenceContext(unitName = "restPersistence")
	private EntityManager entityManager;

	@Transactional("transactionManager")
	@Override
	public Long addBusinessDetails(BusinessDetailsEntity businessDetails)
			throws AppException {

		BusinessDetailsEntity merge = entityManager.merge(businessDetails);
		entityManager.flush();
		return merge.getId();
	}

	@Override
	public void deleteBusinessDetails(Long businessId) throws AppException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBusinessDetails(BusinessDetailsEntity businessDetails)
			throws AppException {
		// TODO Auto-generated method stub

	}

	@Override
	public BusinessDetailsEntity getBusinessDetails(Long businessId)
			throws AppException {
		String sqlString = "SELECT b FROM BusinessDetailsEntity b"
				+ " where b.id = ?1";
		TypedQuery<BusinessDetailsEntity> query = entityManager.createQuery(
				sqlString, BusinessDetailsEntity.class);
		query.setParameter(1, businessId);

		return query.getSingleResult();
	}

	@Override
	public List<BusinessDetailsEntity> getAllBusinessDetails()
			throws AppException {
		String sqlString = "SELECT b FROM BusinessDetailsEntity b"
				+ " ORDER BY b.businessName";
		TypedQuery<BusinessDetailsEntity> query = entityManager.createQuery(
				sqlString, BusinessDetailsEntity.class);

		return query.getResultList();
	}

}
