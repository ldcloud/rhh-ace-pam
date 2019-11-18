package au.com.leonardo.poc.sms_test;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Manifest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String bookingCode;
	private java.lang.String firstName;
	private java.lang.String lastName;
	private java.lang.Integer frequentFlyer;
	private java.lang.String fareclass;
	private java.lang.String seatAllocation;

	private java.lang.String requiresAssistance;

	private java.lang.Boolean hasCheckedBaggage = false;

	public Manifest() {
	}

	public java.lang.String getBookingCode() {
		return this.bookingCode;
	}

	public void setBookingCode(java.lang.String bookingCode) {
		this.bookingCode = bookingCode;
	}

	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	public java.lang.String getLastName() {
		return this.lastName;
	}

	public void setLastName(java.lang.String lastName) {
		this.lastName = lastName;
	}

	public java.lang.Integer getFrequentFlyer() {
		return this.frequentFlyer;
	}

	public void setFrequentFlyer(java.lang.Integer frequentFlyer) {
		this.frequentFlyer = frequentFlyer;
	}

	public java.lang.String getFareclass() {
		return this.fareclass;
	}

	public void setFareclass(java.lang.String fareclass) {
		this.fareclass = fareclass;
	}

	public java.lang.String getSeatAllocation() {
		return this.seatAllocation;
	}

	public void setSeatAllocation(java.lang.String seatAllocation) {
		this.seatAllocation = seatAllocation;
	}

	public java.lang.String getRequiresAssistance() {
		return this.requiresAssistance;
	}

	public void setRequiresAssistance(java.lang.String requiresAssistance) {
		this.requiresAssistance = requiresAssistance;
	}

	public java.lang.Boolean getHasCheckedBaggage() {
		return this.hasCheckedBaggage;
	}

	public void setHasCheckedBaggage(java.lang.Boolean hasCheckedBaggage) {
		this.hasCheckedBaggage = hasCheckedBaggage;
	}

	public Manifest(java.lang.String bookingCode, java.lang.String firstName,
			java.lang.String lastName, java.lang.Integer frequentFlyer,
			java.lang.String fareclass, java.lang.String seatAllocation,
			java.lang.String requiresAssistance,
			java.lang.Boolean hasCheckedBaggage) {
		this.bookingCode = bookingCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.frequentFlyer = frequentFlyer;
		this.fareclass = fareclass;
		this.seatAllocation = seatAllocation;
		this.requiresAssistance = requiresAssistance;
		this.hasCheckedBaggage = hasCheckedBaggage;
	}

}