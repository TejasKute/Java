/*
 * @Author 
 */
package com.bankingsystem;

import javax.swing.JOptionPane;

import com.bankingsystem.model.Account;
import com.bankingsystem.repositoty.AccountDao;
import com.bankingsystem.service.AccountDAOImpl;

/**
 * BANKING OPERATIONS
 *
 */
public class App {

//	static void pq() {
//		String tr = switch ("ss") {
//		case "a" -> "ddddddddddddddd";
//
//		case "b" -> "hhhhhhhhhhhhh";
//		case "c" -> "kkkkkkkkkkk";
//		default -> "uuuuuuuuuu";
//		};
//		System.out.println(tr);
//
//	}
//
//	static void pp() {
//		switch ("ss") {
//		case "a", "kkk" -> {
//			System.out.println("");
//			System.out.println();
//		}
//		case "b" -> System.out.println("");
//		case "c" -> System.out.println("");
//		default -> System.out.println("");
//
//		}
//	}

	public static void main(String[] args) {

		AccountDao dao = new AccountDAOImpl();
		String x = JOptionPane.showInputDialog("Enter choice", "type here");
		switch (x) {
		case "c" -> {
			Account account = new Account();
			// we are hadrcoding this for demo purpose....
			account.setHolderName("dipak");
			account.setAccbalance(50000);
			account.setEmail("dipak@gmail.com");

			dao.createAccount(account);
		}

		case "r" -> dao.readAccount(Integer.parseInt(JOptionPane.showInputDialog("Enter id", "type here")));

		case "u" -> {
			Account updateAcc = new Account();
			updateAcc.setHolderName("samar mallik");
			updateAcc.setAccbalance(60000);
			updateAcc.setEmail("samarmallik@gmail.com");

			dao.updateAccount(Integer.parseInt(JOptionPane.showInputDialog("enter id to update", "type here")),
					updateAcc);
		}

		case "d" -> dao.deleteAccount(Integer.parseInt(JOptionPane.showInputDialog("enter id to delete", "type here")));

		case "w" -> dao.withdrawAmount(Integer.parseInt(JOptionPane.showInputDialog("enter id to delete", "type here")),
				Integer.parseInt(JOptionPane.showInputDialog("enter amount to withdraw", "type here")));

		case "da" -> dao.depositAmount(Integer.parseInt(JOptionPane.showInputDialog("enter id to delete", "type here")),
				Integer.parseInt(JOptionPane.showInputDialog("enter amount to deposit", "type here")));

		case "fd" -> dao.fixedDeposit(Integer.parseInt(JOptionPane.showInputDialog("enter year", "type here")),
				Integer.parseInt(JOptionPane.showInputDialog("enter amount", "type here")));

		default -> System.out.println("enter right choice");

		}
	}
}