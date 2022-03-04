package org.kiot.duplicateemployeeexception;

public class DuplicateEmployeeException extends Exception {
	String errorMessage;

	public DuplicateEmployeeException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
}
