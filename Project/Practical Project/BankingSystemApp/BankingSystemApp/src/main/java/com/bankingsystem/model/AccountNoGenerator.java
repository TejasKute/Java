package com.bankingsystem.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

//This class will generate unique account number
public class AccountNoGenerator implements IdentifierGenerator {
	// this method will generate random account number of 9 digits
	public int generateAccNo() {
		Random random = new Random();
		return random.nextInt(999999999);
	}

	// for unique account number,added 446 and calendar year with random number
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

		Calendar calendar = Calendar.getInstance();
		return 446 + this.generateAccNo() + calendar.get(Calendar.YEAR);

	}

}
