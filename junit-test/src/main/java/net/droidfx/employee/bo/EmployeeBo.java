package net.droidfx.employee.bo;

import net.droidfx.employee.model.Employee;

public class EmployeeBo {
	public double calculateMonthlySalary(Employee employee) {
		double yearlySalary = 0;
		yearlySalary = employee.getMonthlySalary() *12;
		return yearlySalary;
	}
	
	public double calculateAppraisal(Employee employee) {
		double appraisal = 0;
		if (employee.getMonthlySalary() < 10000) {
			appraisal = 500;
		} else {
			appraisal = 1000;
		}
		return appraisal;
	}
}
