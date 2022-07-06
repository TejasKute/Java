package com.bankingsystem;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.bankingsystem.exception.GlobalException;
import com.bankingsystem.model.Account;
import com.bankingsystem.repositoty.AccountDao;
import com.bankingsystem.service.AccountDAOImpl;

class JunitTestCase {

	private static SessionFactory sessionFactory;
	private Session session;

	private final AccountDao ad = new AccountDAOImpl();

	@BeforeAll
	public static void setup() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		System.out.println("SessionFactory created");

	}

	// closing session factory object
	@AfterAll
	public static void tearDown() {
		if (sessionFactory != null)
			sessionFactory.close();
		System.out.println("SessionFactory destroyed");
	}

	// open session before each test case
	@BeforeEach
	public void openSession() {
		session = sessionFactory.openSession();
		System.out.println("Session created");
	}

	// close session after each test case
	@AfterEach
	public void closeSession() {
		if (session != null)
			session.close();
		System.out.println("Session closed\n");
	}

	// test method for createAccount
	@Test
	public void testCreate() {
		System.out.println("............Running testCreate............");

		Account b1 = Account.builder().holderName("ajay").accbalance(50000).email("ajay@gmail.com").build();

		assertThat(((Integer) session.save(b1)) > 0).isTrue();

	}

	// testing read method
	@Test
	public void testRead() {
		Account b1 = Account.builder().holderName("raj").accbalance(50000).email("raj@gmail.com").build();
		session.save(b1);
		Account read = (Account) session.get(Account.class, b1.getAccno());

		assertThat(read.getAccbalance()).isEqualTo(50000);

	}

	// testing update method
	@Test
	public void testUpdate() {
		Account b1 = Account.builder().holderName("nibedita").accbalance(50000).email("nibedita@gmail.com").build();
		session.save(b1);
		Account read = (Account) session.get(Account.class, b1.getAccno());
		read.setHolderName("nibedita chatterjee");
		session.save(read);
		Account afterUpdate = (Account) session.get(Account.class, b1.getAccno());
		assertThat(afterUpdate.getHolderName()).isEqualTo("nibedita chatterjee");
	}

	// testing deposit method
	@Test
	public void testDeposit() {
		int accbal = 6000;
		Account b1 = Account.builder().holderName("john").accbalance(5000).email("john@gmaill.com").build();
		session.save(b1);
		Account read = (Account) session.get(Account.class, b1.getAccno());
		read.setAccbalance(b1.getAccbalance() + accbal);
		session.save(read);
		Account afterDeposit = (Account) session.get(Account.class, b1.getAccno());
		assertThat(afterDeposit.getAccbalance()).isEqualTo(11000);
	}

	// testing deposit method
	@Test
	public void testWithdrawThrowsGlobalException() {

		Account b1 = Account.builder().holderName("john").accbalance(5000).email("john@gmaill.com").build();
		// session.save(b1);
		AccountDao ad = new AccountDAOImpl();
		ad.createAccount(b1);
		Throwable exception = assertThrows(GlobalException.class, () -> ad.withdrawAmount(b1.getAccno(), 5000));
		assertEquals("expected messages", exception.getMessage());

	}

}
