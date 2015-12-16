package com.innovationfollowers.classifieds.rest.dao;

import java.util.List;

import com.innovationfollowers.classifieds.rest.errorhandling.AppException;

public interface BusinessDetailsDao {

	public Long addBusinessDetails(BusinessDetailsEntity businessDetails) throws AppException;
	
	public void deleteBusinessDetails(Long businessId) throws AppException;
	
	public void updateBusinessDetails(BusinessDetailsEntity businessDetails) throws AppException;
	
	public BusinessDetailsEntity getBusinessDetails(Long businessId) throws AppException;

	public List<BusinessDetailsEntity> getAllBusinessDetails() throws AppException;
}
