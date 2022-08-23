package simar_Q1;

import java.util.Random;

/**
 * @author Simarpreet Kaur
 * Testing Invoice clas
 */
public class TestHarness {
	//variables used
	private static Random rand = new Random();
	private static final String INVOICE_AMT = "Invoice amount: $";
	private static final String INVOICE_NUM = "Invoice #: ";
	private static final String DASHED_LINE = "-----------------------------------------";
	private static final String NEXT_LINE = "\n";
	
	

	/**
	 * @param args
	 * main method to test the Invoice class
	 */
	public static void main(String[] args) {

		Invoice[] invoiceData = new Invoice[1000];
		
		invoiceData = createInvoiceData(invoiceData);
		printInvoiceData(invoiceData);
	}

	/**
	 * @param invoiceData
	 * prints data from array onto console
	 */
	private static void printInvoiceData(Invoice[] invoiceData) {
		for(Invoice invoice: invoiceData) {
			Integer invoiceAmount = invoice.getInvoiceAmount();
			if(invoiceAmount > 500) {
				System.out.println(NEXT_LINE + INVOICE_AMT + invoiceAmount);
				System.out.println(INVOICE_NUM + invoice.getInvoiceNumber());
				System.out.println(DASHED_LINE);
			}
		}
	}

	/**
	 * @param invoiceData
	 * @return
	 * creates invoice data
	 */
	private static Invoice[] createInvoiceData(Invoice[] invoiceData) {
		int invoiceNumber = 10_000;
		for(int i = 0; i < 1000; i++) {
			Integer invoiceAmount = getRandomNumber(400, 400);
			invoiceData[i] = new Invoice(invoiceNumber++, invoiceAmount);
		}
		return invoiceData;
	}

	/**
	 * @param threshold
	 * @param limit
	 * @return
	 * creates random value for invoice amount
	 */
	static Integer getRandomNumber(Integer threshold, Integer limit) {
		Integer number = threshold + rand.nextInt(limit);
		return number;
	}

}
