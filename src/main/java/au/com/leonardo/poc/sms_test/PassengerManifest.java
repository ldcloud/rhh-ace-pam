package au.com.leonardo.poc.sms_test;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PassengerManifest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.util.List<au.com.leonardo.poc.sms_test.Manifest> passenger_Manifest;

	public PassengerManifest() {
	}

	public java.util.List<au.com.leonardo.poc.sms_test.Manifest> getPassenger_Manifest() {
		return this.passenger_Manifest;
	}

	public void setPassenger_Manifest(
			java.util.List<au.com.leonardo.poc.sms_test.Manifest> passenger_Manifest) {
		this.passenger_Manifest = passenger_Manifest;
	}

	public PassengerManifest(
			java.util.List<au.com.leonardo.poc.sms_test.Manifest> passenger_Manifest) {
		this.passenger_Manifest = passenger_Manifest;
	}

}