package simar_Q1;

/**
 * @author Simarpreet Kaur
 * Invoice class blueprint
 */
public class Invoice {

	private Integer invoiceNumber;
	private Integer invoiceAmount;
	
	/**
	 * no initialization through default constructor
	 */
	private Invoice() {	}
	
	/**
	 * @param invoiceNumber
	 * @param invoiceAmount
	 * parameterized constructor
	 */
	public Invoice(Integer invoiceNumber, Integer invoiceAmount){
		this.invoiceNumber = invoiceNumber;
		this.invoiceAmount = invoiceAmount;
	}

	/**
	 * @return 
	 * getter invoice number
	 */
	public Integer getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * @param invoiceNumber
	 * setter invoice number
	 */
	public void setInvoiceNumber(Integer invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	/**
	 * @return
	 * getter invoice amount
	 */
	public Integer getInvoiceAmount() {
		return invoiceAmount;
	}

	/**
	 * @param invoiceAmount
	 * setter invoice number
	 */
	public void setInvoiceAmount(Integer invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
}
