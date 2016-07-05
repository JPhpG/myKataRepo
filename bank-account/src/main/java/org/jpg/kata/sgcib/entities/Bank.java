package org.jpg.kata.sgcib.entities;

import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jpg.kata.sgcib.constant.Operation;

/**
 * The Class Bank.
 * 
 * @author Jean-Philippe GALLIEN - J-Ph.G. 
 */
public class Bank {

	/** The Constant logger. */
	public static final Logger logger = LogManager.getLogger(Bank.class);

	/**
	 * Make deposit.
	 *
	 * @param user the user
	 * @param amount the amount
	 * @return the user
	 */
	public User makeDeposit(User user, Long amount) {
		user.setBalance(user.getBalance() + amount);
		logger.info("Deposit DONE for User:"+user.getFirstName());
		Date date = new Date();
		History history = new History(Operation.DEPOSIT, date, amount, user.getBalance());
		user.getHistoryList().add(history);
		return user;
	}

	/**
	 * Withdrawal.
	 *
	 * @param user the user
	 * @param amount the amount
	 * @return the user
	 */
	public User withdrawal(User user, Long amount) {
		user.setBalance(user.getBalance() - amount);
		logger.info("withdrawal DONE for User:"+user.getFirstName());
		Date date = new Date();
		History history = new History(Operation.WITHDRAWAL, date, amount, user.getBalance());
		user.getHistoryList().add(history);
		return user;
	}

	/**
	 * History.
	 *
	 * @param user the user
	 */
	public void history(User user) {
		logger.info(user.getFirstName() +" "+user.getName());
		for (History history : user.getHistoryList()) {
			logger.info(history.toString());
		}
	}
}
