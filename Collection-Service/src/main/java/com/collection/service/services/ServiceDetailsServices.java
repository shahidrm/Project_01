package com.collection.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collection.service.model.ServiceDetails;
import com.collection.service.repository.ServiceDetailsRepository;

@Service
public class ServiceDetailsServices {

	@Autowired
	ServiceDetailsRepository serviceDetailsRepository;
	
	public ServiceDetails savecollectionservice(ServiceDetails serviceDetails) {
		return serviceDetailsRepository.save(serviceDetails);
	}

	public void deleteById(int coll_id) {
		serviceDetailsRepository.deleteById(coll_id);
	}

	public  ServiceDetails updateServiceDetails(ServiceDetails serviceDetails) {
		return serviceDetailsRepository.save(serviceDetails);
	}

}
