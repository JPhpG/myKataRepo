package org.jpg.kata.sgcib.constant;

/**
 * The Enum Operation.
 * 
 * @author Jean-Philippe GALLIEN - J-Ph.G. 
 */
public enum Operation {
	
	/** The deposit. */
	DEPOSIT(1),
	
	/** The withdrawal. */
	WITHDRAWAL(2);
	
	/** The value. */
	private int value;

	/**
	 * Instantiates a new operation.
	 *
	 * @param value the value
	 */
	private Operation(int value) {
	      this.value = value;
	   }

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
}
