package net.droidfx.employee.model;

public class Employee {
	private String name;
	private double monthlySalary;
	private int age;

	public Employee() {
		super();
	}

	/**
	 * @param name
	 * @param monthlySalary
	 * @param age
	 */
	public Employee(String name, double monthlySalary, int age) {
		super();
		this.name = name;
		this.monthlySalary = monthlySalary;
		this.age = age;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public double getMonthlySalary() {
		return monthlySalary;
	}

	/**
	 * @param monthlySalary
	 */
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	/**
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", monthlySalary=" + monthlySalary
				+ ", age=" + age + "]";
	}

}
