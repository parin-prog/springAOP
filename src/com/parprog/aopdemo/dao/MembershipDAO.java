package com.parprog.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addMember() {
		
		System.out.println(getClass() +": Doing Stuff : Add an Membership Account");
	}
}
