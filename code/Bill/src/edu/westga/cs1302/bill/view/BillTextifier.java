package edu.westga.cs1302.bill.view;

import edu.westga.cs1302.bill.model.Bill;
import edu.westga.cs1302.bill.model.BillItem;


/** Generates text to summarize a Bill
 * 
 * @author CS 1302
 * @version Fall 2024
 */
public class BillTextifier {

    /** Return a String summarizing the bill.
     * 
     * @precondition none
     * @postcondition none
     * 
     * @return a String summarizing the bill
     */
    public String getText(Bill bill) {
        if (bill == null) {
            throw new IllegalArgumentException("Must provide a valid Bill");
        }

        StringBuilder text = new StringBuilder();
        text.append("ITEMS").append(System.lineSeparator());
        
        for (BillItem item : bill.getItems()) {
            if (item != null) {
                text.append(item.getName()).append(" - $").append(String.format("%.2f", item.getAmount())).append(System.lineSeparator());
            }
        }
        
        text.append(System.lineSeparator());
        text.append("SUBTOTAL - $").append(String.format("%.2f", bill.getSubTotal())).append(System.lineSeparator());
        text.append("TAX - $").append(String.format("%.2f", bill.getTax())).append(System.lineSeparator());
        text.append("TIP - $").append(String.format("%.2f", bill.getTip())).append(System.lineSeparator());
        text.append("TOTAL - $").append(String.format("%.2f", bill.getTotal()));

        return text.toString();
    }
}