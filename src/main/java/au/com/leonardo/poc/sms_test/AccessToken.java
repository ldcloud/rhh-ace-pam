package au.com.leonardo.poc.sms_test;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class AccessToken implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String access_token;
	private java.lang.String token_type;
	private java.lang.Integer expires_in;

	public AccessToken() {
	}

	public java.lang.String getAccess_token() {
		return this.access_token;
	}

	public void setAccess_token(java.lang.String access_token) {
		this.access_token = access_token;
	}

	public java.lang.String getToken_type() {
		return this.token_type;
	}

	public void setToken_type(java.lang.String token_type) {
		this.token_type = token_type;
	}

	public java.lang.Integer getExpires_in() {
		return this.expires_in;
	}

	public void setExpires_in(java.lang.Integer expires_in) {
		this.expires_in = expires_in;
	}

	public AccessToken(java.lang.String access_token,
			java.lang.String token_type, java.lang.Integer expires_in) {
		this.access_token = access_token;
		this.token_type = token_type;
		this.expires_in = expires_in;
	}

}