package com.bankingsystem.service;

import org.hibernate.Session;

import com.bankingsystem.exception.GlobalException;
import com.bankingsystem.model.Account;
import com.bankingsystem.model.Helper;

public class WithdrawAmount {
	public static void withdrawAmount(int accno, long wamnt) {
		System.out.println("--------------------I am withdraw---------------------");
		try (Session session = Helper.getSession()) {
			Account ac = (Account) session.load(Account.class, accno);
			session.beginTransaction();
			if (wamnt < ac.getAccbalance()) {

				if (wamnt >= 500) { // checking withdraw amount minimum 500rs or not

					ac.setAccbalance(ac.getAccbalance() - wamnt);
					System.out.println(wamnt + " withdraw has done successfully");
					session.saveOrUpdate(ac);
					session.getTransaction().commit();
				} else {
					throw new GlobalException("Minimum withdraw balance 500");
				}
			} else {
				System.out.println("-----------------------------------------");
				throw new GlobalException("Insufficient account balance");
			}

		} catch (GlobalException h) {
			System.out.println("the hibernate error is " + h);
		} catch (Exception h) {
			System.out.println("the hibernate error is " + h);
		}
	}
}
