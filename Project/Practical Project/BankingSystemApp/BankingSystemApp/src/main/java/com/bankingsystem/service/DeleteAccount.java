package com.bankingsystem.service;

import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bankingsystem.model.Account;
import com.bankingsystem.model.Helper;

public class DeleteAccount {
	private static final Logger logger = LoggerFactory.getLogger(DeleteAccount.class);

	public static void deleteAccount(int accno) {
		try (Session session = Helper.getSession()) {
			Account accnt = session.load(Account.class, accno);

			session.beginTransaction();
			int input = JOptionPane.showConfirmDialog(null, "do you want to delete?",
					"select what you want to delete or not?", JOptionPane.YES_NO_OPTION);
			if (input == 0) {
				session.delete(accnt);
				JOptionPane.showMessageDialog(null, "Object is deleted!!!!...");
				logger.info(accno + " account deleted " + " and the time is " + new java.util.Date());
			} else
				JOptionPane.showMessageDialog(null, "User want to retain it...");
			session.getTransaction().commit();

		} catch (HibernateException h) {
			System.out.println("the hibernate error is " + h);
			logger.error("exception happened " + h.toString() + " and error creation time is " + new java.util.Date());
		} catch (Exception h) {
			System.out.println("the general error is " + h);
		}
	}
}
