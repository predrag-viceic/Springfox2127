package com.example.RRCSpringfoxDoc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class MyTestBean {
	
	@Id
	public Integer id;
	
	public String propertyA;
	public String propertyB;

}
