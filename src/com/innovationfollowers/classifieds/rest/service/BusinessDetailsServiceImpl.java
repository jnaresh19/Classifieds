package com.innovationfollowers.classifieds.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.innovationfollowers.classifieds.rest.dao.BusinessDetailsDao;
import com.innovationfollowers.classifieds.rest.dao.BusinessDetailsEntity;
import com.innovationfollowers.classifieds.rest.errorhandling.AppException;
import com.innovationfollowers.classifieds.rest.resource.BusinessDetails;

public class BusinessDetailsServiceImpl implements BusinessDetailsService {

	@Autowired
	private BusinessDetailsDao businessDetailsDao;

	@Override
	public Long addBusinessDetails(BusinessDetails businessDetails)
			throws AppException {

		return businessDetailsDao.addBusinessDetails(new BusinessDetailsEntity(
				businessDetails));
	}

	@Override
	public void deleteBusinessDetails(Long businessId) throws AppException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBusinessDetails(BusinessDetails businessDetails)
			throws AppException {
		// TODO Auto-generated method stub

	}

	@Override
	public BusinessDetails getBusinessDetails(Long id) throws AppException {
		BusinessDetailsEntity businessDetails = businessDetailsDao
				.getBusinessDetails(id);
		return new BusinessDetails(businessDetails);
	}


	private List<BusinessDetails> convertBusinessEntityToBusiness(
			List<BusinessDetailsEntity> businessEntity) {

		List<BusinessDetails> areas = new ArrayList<BusinessDetails>();
		for (BusinessDetailsEntity areaEntity : businessEntity) {
			areas.add(new BusinessDetails(areaEntity));
		}
		return areas;
	}

	public void setBusinessDetailsDao(BusinessDetailsDao businessDetailsDao) {
		this.businessDetailsDao = businessDetailsDao;
	}

	@Override
	public List<BusinessDetails> getAllBusinessDetails() throws AppException {
		
		List<BusinessDetailsEntity> businessDetails = businessDetailsDao.getAllBusinessDetails();
		return convertBusinessEntityToBusiness(businessDetails);
	}

}
