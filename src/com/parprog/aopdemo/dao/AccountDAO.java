package com.parprog.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount() {
		
		System.out.println(getClass() +": Doing My Work : Add an Account");
	}
	
}
