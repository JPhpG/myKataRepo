package org.jpg.kata.sgcib;

import org.jpg.kata.sgcib.entities.Bank;
import org.jpg.kata.sgcib.entities.User;

/**
 * The Class Main.
 * 
 * @author Jean-Philippe GALLIEN - J-Ph.G. 
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// Create Users
		User user1 = new User("USER1", "FOO", 0L);
		User user2 = new User("USER2", "BAR", 1000L);

		// Create Bank
		Bank bank = new Bank();
		
		// User1 make a deposit - US1
		user1 = bank.makeDeposit(user1, 3000L);
		// User's History in Bank - US3
		bank.history(user1);
		// User1 make a withdrawal - US2
		user1 = bank.withdrawal(user1, 2000L);
		// User's History in Bank - US3
		bank.history(user1);
		
		// User2 make a deposit - US1
		user2 = bank.makeDeposit(user2, 500L);
		// User's History in Bank - US3
		bank.history(user2);
		// User2 make a withdrawal - US2
		user2 = bank.withdrawal(user2, 1593L);
		// User's History in Bank - US3
		bank.history(user2);
	}

}
