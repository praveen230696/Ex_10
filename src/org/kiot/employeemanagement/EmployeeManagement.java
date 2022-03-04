package org.kiot.employeemanagement;

import org.kiot.companyservice.CompanyService;
import org.kiot.duplicateemployeeexception.DuplicateEmployeeException;
import org.kiot.employee.Employee;
import org.kiot.employeenotavailableexception.EmployeeNotAvailableException;
import org.kiot.invaildsalaryexception.InvaildSalaryException;

import java.util.Scanner;

public class EmployeeManagement {

	public static void main(String[] args) throws DuplicateEmployeeException, EmployeeNotAvailableException, InvaildSalaryException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee(1, "praveen", "salem", 50000);
		CompanyService companyService = new CompanyService(123, "chennai", employee);
		
		try {
			if(employee.getSalary() <= 0) {
				throw new InvaildSalaryException("Invalid salary");
			} else {
				if (companyService.createEmployee(employee) == true)  {
					System.out.println("Employee details added successfully");
				} else {
					throw new DuplicateEmployeeException("Employee details adding failed");
				}
			}
		} catch (InvaildSalaryException e) {
			// TODO: handle exception
			System.out.println(e.getErrorMessage());
		}
		
		
		System.out.println("Enter id to search:");
		int id = scanner.nextInt();
		try {
			if (companyService.searchEmployee(id)) {
				System.out.println(employee);
				System.out.println("based on given id employee details displayed successfully");
			}
			
			else {
				throw new EmployeeNotAvailableException("id not found Please provide correct employee id");
			}

		} catch(EmployeeNotAvailableException e) {
			System.out.println(e.getErrorMessage());
		}
				
		Employee newSalary = new Employee();
		newSalary.setId(employee.getId());
		newSalary.setSalary(20000);
		
		System.out.println("Enter id to update:");
		
		try {
			if (companyService.searchEmployee(scanner.nextInt()) ) {
				if (companyService.updateSalary(newSalary)) {
					System.out.println("After updation ");
					System.out.println(employee);
					System.out.println("based on given id employee salary updated successfully");
				} else {
					throw new EmployeeNotAvailableException("id not found Please provide correct employee id");
				}
			}
		} catch(EmployeeNotAvailableException e) {
				System.out.println(e.getErrorMessage());
		}

		
		if (companyService.deleteEmployee(employee.getId())) {
			System.out.println("based on id products deleted successfully");
		}
		
		else {
			System.out.println("id not found");
		}
	}

}

