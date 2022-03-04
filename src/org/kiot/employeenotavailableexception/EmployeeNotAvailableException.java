package org.kiot.employeenotavailableexception;

public class EmployeeNotAvailableException extends Exception {
	String errorMessage;

	public EmployeeNotAvailableException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
}
