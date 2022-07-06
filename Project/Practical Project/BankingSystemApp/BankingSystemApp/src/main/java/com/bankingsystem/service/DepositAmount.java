package com.bankingsystem.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.bankingsystem.model.Account;
import com.bankingsystem.model.Helper;

public class DepositAmount {
	public static void depositAmount(int accno, long damnt) {

		try (Session session = Helper.getSession()) {

			Account acc = (Account) session.load(Account.class, accno);
			session.beginTransaction();

			acc.setAccbalance(acc.getAccbalance() + damnt);

			session.getTransaction().commit();
			System.out.println("deposit is completed");

		} catch (HibernateException h) {
			System.out.println("the hibernate error is " + h);
		} catch (Exception h) {
			System.out.println("the hibernate error is " + h);
		}
	}
}
