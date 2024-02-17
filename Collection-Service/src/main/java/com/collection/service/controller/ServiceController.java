package com.collection.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.collection.service.model.ServiceDetails;
import com.collection.service.services.ServiceDetailsServices;


    @RestController
    public class ServiceController {
	  

	  @Autowired
	  ServiceDetailsServices serviceDetailsServices;
	
	@PostMapping("/InsertData")
	public ServiceDetails savecollectionservice(@RequestBody ServiceDetails serviceDetails) {
		return serviceDetailsServices.savecollectionservice(serviceDetails);
		
	}
	
	  @DeleteMapping("/DeleteById/{coll_id}")
	  public void deleteById(@PathVariable int coll_id) {
		  serviceDetailsServices.deleteById(coll_id);
		  
	  }
	  
	  @PutMapping("/ModifyServiceDetails")
	  public ServiceDetails updateServiceDetails(ServiceDetails serviceDetails) {
		 return serviceDetailsServices.updateServiceDetails(serviceDetails);
	  }

}
