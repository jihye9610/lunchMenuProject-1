package com.wide.lunch.testDomain;

import lombok.Data;

import javax.persistence.*;



@Data
@Entity
@Table(name="test_user")
public class testUser {
		
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	private String number;
	
	private String tel;
	
	    
}
