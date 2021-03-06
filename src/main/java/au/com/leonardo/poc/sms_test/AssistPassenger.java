package au.com.leonardo.poc.sms_test;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AssistPassenger implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String eventType;
	private java.lang.String assistanceType;
	private java.lang.String flightNumber;
	private java.lang.String passengerName;
	private java.lang.String actions;

	public AssistPassenger() {
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public java.lang.String getEventType() {
		return eventType;
	}

	public void setEventType(java.lang.String eventType) {
		this.eventType = eventType;
	}

	public java.lang.String getAssistanceType() {
		return assistanceType;
	}

	public void setAssistanceType(java.lang.String assistanceType) {
		this.assistanceType = assistanceType;
	}

	public java.lang.String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(java.lang.String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public java.lang.String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(java.lang.String passengerName) {
		this.passengerName = passengerName;
	}

	public java.lang.String getActions() {
		return actions;
	}

	public void setActions(java.lang.String actions) {
		this.actions = actions;
	}

	public AssistPassenger(java.lang.String eventType,
			java.lang.String assistanceType, java.lang.String flightNumber,
			java.lang.String passengerName, java.lang.String actions) {
		this.eventType = eventType;
		this.assistanceType = assistanceType;
		this.flightNumber = flightNumber;
		this.passengerName = passengerName;
		this.actions = actions;
	}
}