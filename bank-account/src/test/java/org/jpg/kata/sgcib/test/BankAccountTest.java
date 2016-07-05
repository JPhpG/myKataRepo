package org.jpg.kata.sgcib.test;

import static org.junit.Assert.*;

import org.jpg.kata.sgcib.constant.Operation;
import org.jpg.kata.sgcib.entities.Bank;
import org.jpg.kata.sgcib.entities.History;
import org.jpg.kata.sgcib.entities.User;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class BankAccountTest.
 * 
 * @author Jean-Philippe GALLIEN - J-Ph.G. 
 */
public class BankAccountTest {

	/**
	 * User Story 1 Make deposit test.
	 */
	public void makeDepositTest() {
		// Test for User1
		Long beforDepot = user1.getBalance();
		Long amountDepot = 3000L;
		Long balanceExpected = beforDepot + amountDepot;
		bank.makeDeposit(user1, amountDepot);
		assertEquals("Balance not equal for user1", balanceExpected,
				user1.getBalance());

		// Test for User2
		beforDepot = user2.getBalance();
		amountDepot = 6000L;
		balanceExpected = beforDepot + amountDepot;
		bank.makeDeposit(user2, amountDepot);
		assertEquals("Balance not equal for User2", balanceExpected,
				user2.getBalance());
	}

	/**
	 * User Story 2 Withdrawal test.
	 */
	public void withdrawalTest() {
		// User1 make a withdrawal
		Long beforWithdrawal = user1.getBalance();
		Long amountWithdrawal = 3000L;
		Long balanceExpected = beforWithdrawal - amountWithdrawal;
		bank.withdrawal(user1, amountWithdrawal);
		assertEquals("Balance not equal for user1", balanceExpected,
				user1.getBalance());

		// User2 make a withdrawal
		beforWithdrawal = user2.getBalance();
		amountWithdrawal = 3000L;
		balanceExpected = beforWithdrawal - amountWithdrawal;
		bank.withdrawal(user2, amountWithdrawal);
		assertEquals("Balance not equal for user2", balanceExpected,
				user2.getBalance());
	}

	/**
	 * User Story 3 History test.
	 */
	public void historyTest() {
		// User1's history display
		bank.history(user1);

		// Test operations in History
		String historyUser1Str = "";
		for (History history : user1.getHistoryList()) {
			historyUser1Str += history.toString();

		}
		assertTrue(historyUser1Str.contains(Operation.DEPOSIT.name()));
		assertTrue(historyUser1Str.contains(Operation.WITHDRAWAL.name()));

		// User2's history display
		bank.history(user2);

		// Test operations in History
		String historyUser2Str = "";
		for (History history : user2.getHistoryList()) {
			historyUser2Str += history.toString();
		}
		assertTrue(historyUser2Str.contains(Operation.DEPOSIT.name()));
		assertTrue(historyUser2Str.contains(Operation.WITHDRAWAL.name()));
	}

	// Run all the Test in one.
	// You can also Run one by one putting Annotation @Test
	@Test
	public void bankAccountTest() {
		// Test US1
		makeDepositTest();
		
		// Test US2
		withdrawalTest();
		
		// Test US3
		historyTest();
	}

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
		// Create User
		user1 = new User("USER1", "FOO", 0L);
		user2 = new User("USER2", "BAR", 1000L);
		// Create Bank
		bank = new Bank();
	}

	/** The user1. */
	private User user1;

	/** The user2. */
	private User user2;

	/** The bank. */
	private Bank bank;

}
