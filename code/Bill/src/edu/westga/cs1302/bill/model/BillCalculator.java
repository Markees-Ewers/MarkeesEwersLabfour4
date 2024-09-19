package edu.westga.cs1302.bill.model;

public class BillCalculator {
	private static final double TAX_RATE = 0.10; // 10% tax rate
	private static final double TIP_RATE = 0.20; // 20% tip rate

	/**
	 * Calculate the subtotal for an array of BillItem objects.
	 *
	 * @param items the array of BillItem objects
	 * @return the subtotal of all valid BillItem objects in the array
	 * @precondition items != null
	 * @postcondition none
	 */
	public static double calculateSubtotal(BillItem[] items) {
		double subtotal = 0.0;
		for (BillItem item : items) {
			if (item != null) {
				subtotal += item.getAmount();
			}
		}
		return subtotal;
	}

	/**
	 * Calculate the tax based on the subtotal.
	 *
	 * @param items the array of BillItem objects
	 * @return the tax calculated from the subtotal
	 * @precondition items != null
	 * @postcondition none
	 */
	public static double calculateTax(BillItem[] items) {
		double subtotal = calculateSubtotal(items);
		return subtotal * TAX_RATE;
	}

	/**
	 * Calculate the tip based on the subtotal.
	 *
	 * @param items the array of BillItem objects
	 * @return the tip calculated from the subtotal
	 * @precondition items != null
	 * @postcondition none
	 */
	public static double calculateTip(BillItem[] items) {
		double subtotal = calculateSubtotal(items);
		return subtotal * TIP_RATE;
	}

	/**
	 * Calculate the total cost, including subtotal, tax, and tip.
	 *
	 * @param items the array of BillItem objects
	 * @return the total cost
	 * @precondition items != null
	 * @postcondition none
	 */
	public static double calculateTotal(BillItem[] items) {
		double subtotal = calculateSubtotal(items);
		double tax = calculateTax(items);
		double tip = calculateTip(items);
		return subtotal + tax + tip;
	}
}