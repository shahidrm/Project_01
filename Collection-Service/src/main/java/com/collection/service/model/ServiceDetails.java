package com.collection.service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Collection_Service")
public class ServiceDetails {
	
	@Id
	private int coll_id;
	
	
	private String coll_type;
	
	
	private String description;
	
	
	private int coll_amoun;


	public int getColl_id() {
		return coll_id;
	}


	public void setColl_id(int coll_id) {
		this.coll_id = coll_id;
	}


	public String getColl_type() {
		return coll_type;
	}


	public void setColl_type(String coll_type) {
		this.coll_type = coll_type;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getColl_amoun() {
		return coll_amoun;
	}


	public void setColl_amoun(int coll_amoun) {
		this.coll_amoun = coll_amoun;
	}


	
	
	

}
