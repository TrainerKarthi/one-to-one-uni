package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompanyController {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Company company = new Company();
		company.setName("test yantra");
		company.setPhone(8765432);
		company.setWeb("www.testyantra.com");
		
		Gst gst = new Gst();
		gst.setState("Andhra pradesh");
		gst.setCountry("India");
		gst.setGstNumber("0987654");
		gst.setCompany(company);
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
	}

}
