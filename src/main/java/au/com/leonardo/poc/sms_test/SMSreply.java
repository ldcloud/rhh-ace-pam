package au.com.leonardo.poc.sms_test;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class SMSreply implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String body;
	private java.lang.String from;
	private java.lang.String messageId;
	private java.lang.String sentTimestamp;
	private java.lang.String to;

	public SMSreply() {
	}

	public java.lang.String getBody() {
		return this.body;
	}

	public void setBody(java.lang.String body) {
		this.body = body;
	}

	public java.lang.String getFrom() {
		return this.from;
	}

	public void setFrom(java.lang.String from) {
		this.from = from;
	}

	public java.lang.String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(java.lang.String messageId) {
		this.messageId = messageId;
	}

	public java.lang.String getSentTimestamp() {
		return this.sentTimestamp;
	}

	public void setSentTimestamp(java.lang.String sentTimestamp) {
		this.sentTimestamp = sentTimestamp;
	}

	public java.lang.String getTo() {
		return this.to;
	}

	public void setTo(java.lang.String to) {
		this.to = to;
	}

	public SMSreply(java.lang.String body, java.lang.String from,
			java.lang.String messageId, java.lang.String sentTimestamp,
			java.lang.String to) {
		this.body = body;
		this.from = from;
		this.messageId = messageId;
		this.sentTimestamp = sentTimestamp;
		this.to = to;
	}

}