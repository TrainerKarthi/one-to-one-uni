package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetBranchAddress {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Branch branch = entityManager.find(Branch.class, 1);
		
		if (branch != null) {
			System.out.println(branch.getName());
			System.out.println(branch.getState());
			System.out.println(branch.getCountry());
			
			Address address = branch.getAddress();
			
			System.out.println(address.getName());
			System.out.println(address.getDoorno());
			System.out.println(address.getPin());
		}
		else
		{
			System.out.println("not found");
		}
		
	}

}
