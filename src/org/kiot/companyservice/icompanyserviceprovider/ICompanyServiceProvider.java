package org.kiot.companyservice.icompanyserviceprovider;

import org.kiot.employee.Employee;

public interface ICompanyServiceProvider {
	boolean createEmployee(Employee employee);
	boolean searchEmployee(int id);
	boolean updateSalary(Employee employee);
	boolean deleteEmployee(int id);
}
