package EmployeeSalary;

public class Employee {
//Hello Change Done!! aaa
	private int employeeId;
	private String employeeName;
	private double Salary;
	private double netSalary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	public void calculateNetSalary(int pfpercentage)
	{    double x= (pfpercentage)/(100.00);
		double netSalary= getSalary()-x*getSalary();
		System.out.println(netSalary);
		setNetSalary(netSalary);
	}
	

}
