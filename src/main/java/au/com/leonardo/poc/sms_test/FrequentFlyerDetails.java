package au.com.leonardo.poc.sms_test;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FrequentFlyerDetails implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String frequentFlyerNo;
	private java.lang.String frequentFlyerLevel;
	private java.lang.String preferredLanguage;
	private java.lang.String mobileNumber;
	private java.lang.String emailAddress;
	private java.lang.String contactPreference;

	private java.lang.String firstName;

	private java.lang.String lastName;

	public FrequentFlyerDetails() {
	}

	public java.lang.String getFrequentFlyerNo() {
		return this.frequentFlyerNo;
	}

	public void setFrequentFlyerNo(java.lang.String frequentFlyerNo) {
		this.frequentFlyerNo = frequentFlyerNo;
	}

	public java.lang.String getFrequentFlyerLevel() {
		return this.frequentFlyerLevel;
	}

	public void setFrequentFlyerLevel(java.lang.String frequentFlyerLevel) {
		this.frequentFlyerLevel = frequentFlyerLevel;
	}

	public java.lang.String getPreferredLanguage() {
		return this.preferredLanguage;
	}

	public void setPreferredLanguage(java.lang.String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public java.lang.String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(java.lang.String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public java.lang.String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(java.lang.String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public java.lang.String getContactPreference() {
		return this.contactPreference;
	}

	public void setContactPreference(java.lang.String contactPreference) {
		this.contactPreference = contactPreference;
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

	public FrequentFlyerDetails(java.lang.String frequentFlyerNo,
			java.lang.String frequentFlyerLevel,
			java.lang.String preferredLanguage, java.lang.String mobileNumber,
			java.lang.String emailAddress, java.lang.String contactPreference,
			java.lang.String firstName, java.lang.String lastName) {
		this.frequentFlyerNo = frequentFlyerNo;
		this.frequentFlyerLevel = frequentFlyerLevel;
		this.preferredLanguage = preferredLanguage;
		this.mobileNumber = mobileNumber;
		this.emailAddress = emailAddress;
		this.contactPreference = contactPreference;
		this.firstName = firstName;
		this.lastName = lastName;
	}

}