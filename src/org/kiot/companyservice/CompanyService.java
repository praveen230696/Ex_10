package org.kiot.companyservice;

import org.kiot.companyservice.icompanyserviceprovider.ICompanyServiceProvider;
import java.util.ArrayList;
import java.util.List;

import org.kiot.employee.Employee;

public class CompanyService implements ICompanyServiceProvider {

		private int companyID;
		private String address;
		Employee employee;
		private List<Employee>employeeList = new ArrayList<Employee>();
		public CompanyService() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CompanyService(int companyID, String address, Employee employee) {
			super();
			this.companyID = companyID;
			this.address = address;
			this.employee = employee;
		}
		
		@Override
		public boolean createEmployee(Employee employee) {
			// TODO Auto-generated method stub
			int flag = 0;
			if (employee != null) {						
				employeeList.add(employee);
				flag = 1;
			}
			if (flag == 1) {
				int temp = 1;
				List<Employee>newemployeeList = new ArrayList<Employee>();
				for (Employee employee1 : employeeList) {
					if(newemployeeList.contains(employeeList)) {
						temp = 0;  
					}
				}
				if (temp == 1) {
					return true;
				}
			}
			return false;
		}
		
		@Override
		public boolean searchEmployee(int id) {
			for(Employee employee : employeeList) {
				if(employee.getId() == id) {
					//System.out.println(product);
					return true;
				}
			}
			return false;
		}
		
		@Override
		public boolean updateSalary(Employee employee) {
			// TODO Auto-generated method stub
			int counter = 0;
			for(Employee inneremployee : employeeList) {
				if(inneremployee.getId() == employee.getId()) {
					if(employee.getSalary() != 0) {
					employeeList.get(counter).setSalary(employee.getSalary());
					return true;
					}
				}
				counter++;
			}
			return false;
		}		
		
		@Override
		public boolean deleteEmployee(int id) {
			// TODO Auto-generated method stub
			int counter = 0;
			for(Employee employee : employeeList) {
				if(employee.getId() == id) {
					employeeList.remove(counter);
					return true;
				}
				counter++;
			}

			return false;
		}
}
