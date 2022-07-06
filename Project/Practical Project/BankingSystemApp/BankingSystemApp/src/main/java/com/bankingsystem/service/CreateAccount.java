package com.bankingsystem.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bankingsystem.model.Account;
import com.bankingsystem.model.Helper;

public class CreateAccount {
	private static final Logger logger = LoggerFactory.getLogger(CreateAccount.class);

	public static void createAccount(Account account) {
		try (Session session = Helper.getSession()) {

			// creating a new Account object
			session.beginTransaction();
			session.save(account);
			// java object saved to the database
			session.getTransaction().commit();
			session.clear();
			logger.info("new account created " + account.toString() + " and creation time is " + new java.util.Date());

		} catch (HibernateException h) {
			// UI is not scope of the project

			System.out.println("The hibernate error is " + h);
			logger.error("exception happened " + h.toString() + " and error creation time is " + new java.util.Date());
		} catch (Exception e) {
			System.out.println("the error is " + e);

		}
	}
}
