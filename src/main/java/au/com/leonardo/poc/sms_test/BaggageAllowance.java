package au.com.leonardo.poc.sms_test;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BaggageAllowance implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String cabin;
	private java.lang.String checked;
	private java.lang.String price;

	private java.lang.String airline;

	public BaggageAllowance() {
	}

	public java.lang.String getCabin() {
		return this.cabin;
	}

	public void setCabin(java.lang.String cabin) {
		this.cabin = cabin;
	}

	public java.lang.String getChecked() {
		return this.checked;
	}

	public void setChecked(java.lang.String checked) {
		this.checked = checked;
	}

	public java.lang.String getPrice() {
		return this.price;
	}

	public void setPrice(java.lang.String price) {
		this.price = price;
	}

	public java.lang.String getAirline() {
		return this.airline;
	}

	public void setAirline(java.lang.String airline) {
		this.airline = airline;
	}

	public BaggageAllowance(java.lang.String cabin, java.lang.String checked,
			java.lang.String price, java.lang.String airline) {
		this.cabin = cabin;
		this.checked = checked;
		this.price = price;
		this.airline = airline;
	}

}