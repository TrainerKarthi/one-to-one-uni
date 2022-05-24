package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveBranchAddress {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Branch branch = new Branch();
		branch.setName("Karthik");
		branch.setCountry("India");
		branch.setState("Andhra Pradesh");
		
		Address address = new Address();
		address.setDoorno(20);
		address.setName("karthik");
		address.setPin(517002);
		
		branch.setAddress(address);
		entityTransaction.begin();
		entityManager.persist(branch);
		entityManager.persist(address);
		entityTransaction.commit();
		
		
	}

}
