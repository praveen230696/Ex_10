package org.kiot.invaildsalaryexception;

public class InvaildSalaryException extends Exception {
	String errorMessage;

	public InvaildSalaryException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
}
