package com.bankingsystem.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bankingsystem.model.Account;
import com.bankingsystem.model.Helper;

public class UpdateAccount {
	private static final Logger logger = LoggerFactory.getLogger(UpdateAccount.class);

	public static void updateAccount(int acno, Account a) {

		try (Session session = Helper.getSession()) {
			Account ac = (Account) session.load(Account.class, acno);
			System.out.println("before update: " + ac);
			ac.setHolderName(a.getHolderName());
			ac.setAccbalance(a.getAccbalance());
			ac.setEmail(a.getEmail());
			session.beginTransaction();
			session.saveOrUpdate(ac);
			session.getTransaction().commit();
			System.out.println("After update: " + ac);
			logger.info("account updated  " + ac.toString() + " and time is " + new java.util.Date());

		} catch (HibernateException he) {
			System.out.println("the hibernate error is: " + he);
			logger.error("exception happened " + he.toString() + " and error creation time is " + new java.util.Date());
		} catch (Exception e) {
			System.out.println("the hibernate error is: " + e);
		}
	}
}
