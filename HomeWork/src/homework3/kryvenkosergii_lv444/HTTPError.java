package homework3.kryvenkosergii_lv444;

public enum HTTPError {

	ERROR400("BadRequest"), ERROR401("Unauthorized"), ERROR402("PaymentRequired"), ERROR403("Forbidden"),
	ERROR404("NotFound"), ERROR405("MethodNotAllowed"), ERROR406("NotAcceptable");

	private String name;

	HTTPError(String nameError) {
		this.name = nameError;
	}

	public String getNameError() {
		return name;
	}

}
