package com.bankingsystem.service;

import com.bankingsystem.model.Account;
import com.bankingsystem.repositoty.AccountDao;

public class AccountDAOImpl implements AccountDao {

	@Override
	public void createAccount(Account account) {
		// TODO Auto-generated method stub
		CreateAccount.createAccount(account);
	}

	@Override
	public void readAccount(int accno) {
		// TODO Auto-generated method stub
		ReadAccount.readAccount(accno);
	}

	@Override
	public void updateAccount(int acno, Account a) {
		// TODO Auto-generated method stub
		UpdateAccount.updateAccount(acno, a);
	}

	@Override
	public void deleteAccount(int accno) {
		// TODO Auto-generated method stub
		DeleteAccount.deleteAccount(accno);
	}

	@Override
	public void withdrawAmount(int accno, long wamnt) {
		// TODO Auto-generated method stub
		WithdrawAmount.withdrawAmount(accno, wamnt);
	}

	@Override
	public void depositAmount(int accno, long damnt) {
		// TODO Auto-generated method stub
		DepositAmount.depositAmount(accno, damnt);
	}

	@Override
	public void fixedDeposit(int year, int amnt) {
		// TODO Auto-generated method stub
		FixedDeposite.fixedDeposit(year, amnt);
	}

}
