package com.bankingsystem.repositoty;

import com.bankingsystem.model.Account;

public interface AccountDao {

	void createAccount(Account account);

	void readAccount(int accno);

	void updateAccount(int acno, Account a);

	void deleteAccount(int accno);

	void withdrawAmount(int accno, long wamnt);

	void depositAmount(int accno, long damnt);

	void fixedDeposit(int year, int amnt);
}
