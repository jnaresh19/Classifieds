package com.innovationfollowers.classifieds.rest.service;

import java.util.List;

import com.innovationfollowers.classifieds.rest.errorhandling.AppException;
import com.innovationfollowers.classifieds.rest.resource.BusinessDetails;

public interface BusinessDetailsService {

	public Long addBusinessDetails(BusinessDetails businessDetails) throws AppException;
	
	public void deleteBusinessDetails(Long businessId) throws AppException;
	
	public void updateBusinessDetails(BusinessDetails businessDetails) throws AppException;
	
	public BusinessDetails getBusinessDetails(Long id)  throws AppException ;

	public List<BusinessDetails> getAllBusinessDetails()  throws AppException;
}
