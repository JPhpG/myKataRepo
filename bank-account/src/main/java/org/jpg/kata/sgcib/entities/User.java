package org.jpg.kata.sgcib.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class User.
 *  
 * @author Jean-Philippe GALLIEN - J-Ph.G. 
 */
public class User implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3900795953423038306L;

	/** The name. */
	private String name;
	
	/** The first name. */
	private String firstName;
	
	/** The balance. */
	private Long balance;
	
	/** The history list. */
	private List<History> historyList;

	/**
	 * Instantiates a new user.
	 */
	public User() {
		super();
	}

	/**
	 * Instantiates a new user.
	 *
	 * @param name the name
	 * @param firstName the first name
	 * @param balance the balance
	 */
	public User(String name, String firstName, Long balance) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.balance = balance;
		this.historyList = new ArrayList<History>();
	}


	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the balance.
	 *
	 * @return the balance
	 */
	public Long getBalance() {
		return balance;
	}

	/**
	 * Sets the balance.
	 *
	 * @param balance the new balance
	 */
	public void setBalance(Long balance) {
		this.balance = balance;
	}

	/**
	 * Gets the history list.
	 *
	 * @return the history list
	 */
	public List<History> getHistoryList() {
		return historyList;
	}

	/**
	 * Sets the history list.
	 *
	 * @param historyList the new history list
	 */
	public void setHistoryList(List<History> historyList) {
		this.historyList = historyList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((historyList == null) ? 0 : historyList.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (historyList == null) {
			if (other.historyList != null)
				return false;
		} else if (!historyList.equals(other.historyList))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
