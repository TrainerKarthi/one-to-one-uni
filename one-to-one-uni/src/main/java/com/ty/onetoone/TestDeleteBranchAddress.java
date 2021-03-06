package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteBranchAddress {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Branch branch = entityManager.find(Branch.class, 5);

		if (branch != null) {

			Address address = branch.getAddress();
			entityTransaction.begin();
			entityManager.remove(address);
			entityManager.remove(branch);
			entityTransaction.commit();

		} else {

			System.out.println("not found");
		}
	}

}
