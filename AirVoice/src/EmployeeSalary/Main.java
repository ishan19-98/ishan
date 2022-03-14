package EmployeeSalary;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Employee e1=getEmployeeDetails();
		int x= getPFPercentage();
		e1.calculateNetSalary(x);
		
		System.out.println("Id:"+e1.getEmployeeId());
		System.out.println("Name:"+e1.getEmployeeName());
		System.out.println("Salary:"+e1.getSalary());
		System.out.println("NetSalary:"+e1.getNetSalary());

		
		
	}
	
	public static Employee getEmployeeDetails()
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Id:");
		int id=sc.nextInt();
		System.out.println("Enter Name:");
		String name1=sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter Salary:");
		double salary=sc.nextDouble();
		
		Employee e=new Employee();
		
		e.setEmployeeId(id);
		e.setEmployeeName(name);
		e.setSalary(salary);
		
		return e;
		
	}
	
	public static int getPFPercentage()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter PF Percentage:");
		int pf=sc.nextInt();
		
		return pf;
		
	}
}

