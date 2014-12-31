package net.droidfx;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import net.droidfx.employee.bo.EmployeeBo;
import net.droidfx.employee.model.Employee;

public class TestEmployee extends TestCase{
	EmployeeBo bo = new EmployeeBo();
	Employee employee = new Employee();
	
	@Before
	public void setUp() {
		System.out.println("Setting up Employee");
		employee.setName("Jon");
		employee.setAge(30);
		employee.setMonthlySalary(6000);
	}
	
	@Test
	public void testCalculateAppraisal() {
		System.out.println("Testing calculateAppraisal");
		double appraisal = bo.calculateAppraisal(employee);
		assertEquals(500, appraisal, 0.0);
	}
	
	@Test
	public void testCalculateYearlySalary() {
		System.out.println("Testing calculateYearlySalary");
		double salary = bo.calculateMonthlySalary(employee);
		assertEquals(71000, salary, 0.00);
	}
	
	@After
	public void tearDown(){
	}
	
	
}
