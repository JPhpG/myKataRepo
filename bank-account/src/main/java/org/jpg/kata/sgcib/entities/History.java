package org.jpg.kata.sgcib.entities;

import java.io.Serializable;
import java.util.Date;

import org.jpg.kata.sgcib.constant.Operation;

/**
 * The Class History.
 * 
 * @author Jean-Philippe GALLIEN - J-Ph.G. 
 */
public class History implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6803869881147676387L;

	/** The operation. */
	private Operation operation;
	
	/** The ope date. */
	private Date opeDate;
	
	/** The amount. */
	private Long amount;
	
	/** The balance. */
	private Long balance;

	/**
	 * Instantiates a new history.
	 */
	public History() {
		super();
	}

	/**
	 * Instantiates a new history.
	 *
	 * @param operation the operation
	 * @param opeDate the ope date
	 * @param amount the amount
	 * @param balance the balance
	 */
	public History(Operation operation, Date opeDate, Long amount, Long balance) {
		super();
		this.operation = operation;
		this.opeDate = opeDate;
		this.amount = amount;
		this.balance = balance;
	}

	/**
	 * Gets the operation.
	 *
	 * @return the operation
	 */
	public Operation getOperation() {
		return operation;
	}

	/**
	 * Sets the operation.
	 *
	 * @param operation the new operation
	 */
	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	/**
	 * Gets the ope date.
	 *
	 * @return the ope date
	 */
	public Date getOpeDate() {
		return opeDate;
	}

	/**
	 * Sets the ope date.
	 *
	 * @param opeDate the new ope date
	 */
	public void setOpeDate(Date opeDate) {
		this.opeDate = opeDate;
	}

	/**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
	public Long getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 *
	 * @param amount the new amount
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + ((operation == null) ? 0 : operation.hashCode());
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
		History other = (History) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		if (operation == null) {
			if (other.operation != null)
				return false;
		} else if (!operation.equals(other.operation))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "History [operation=" + operation + ", opeDate=" + opeDate + ", amount=" + amount + ", balance="
				+ balance + "]";
	}
	
	
}
