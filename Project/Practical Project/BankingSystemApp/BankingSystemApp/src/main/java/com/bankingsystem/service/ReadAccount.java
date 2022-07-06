package com.bankingsystem.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bankingsystem.model.Account;
import com.bankingsystem.model.Helper;

public class ReadAccount {
	private static final Logger logger = LoggerFactory.getLogger(ReadAccount.class);

	public static void readAccount(int accno) {
		try (Session session = Helper.getSession()) {
			Account ac = (Account) session.load(Account.class, accno);
			System.out.println("Account holder name is: " + ac.getHolderName() + " Account Balance is: "
					+ ac.getAccbalance() + " Email is: " + ac.getEmail());
			logger.info("account details read  " + ac.toString() + " and time is " + new java.util.Date());

		} catch (HibernateException h) {
			System.out.println("The error is " + h);
			logger.error("exception happened " + h.toString() + " and error creation time is " + new java.util.Date());
		} catch (Exception e) {
			System.out.println("The general error is " + e);
		}
	}
}
