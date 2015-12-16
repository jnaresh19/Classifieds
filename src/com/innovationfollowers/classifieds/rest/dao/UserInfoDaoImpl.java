package com.innovationfollowers.classifieds.rest.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

import com.innovationfollowers.classifieds.rest.errorhandling.AppException;

public class UserInfoDaoImpl implements UserInfoDao{

	@PersistenceContext(unitName="restPersistence")
	private EntityManager entityManager;
	
	@Transactional("transactionManager")
	@Override
	public Long addUserInfo(UserInfoEntity userInfo) throws AppException{
		
		UserInfoEntity merge = entityManager.merge(userInfo);
		entityManager.flush();

		return merge.getId();
		
	}

	@Override
	public UserInfoEntity getUserInfo(Long id) throws AppException {
		String sqlString = "SELECT u FROM UserInfoEntity u"
				+ " where u.id = ?1";
		TypedQuery<UserInfoEntity> query = entityManager.createQuery(
				sqlString, UserInfoEntity.class);
		query.setParameter(1, id);

		return query.getSingleResult();
	}

}
