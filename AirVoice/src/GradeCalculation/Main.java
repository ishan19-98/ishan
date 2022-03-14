package GradeCalculation;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df=new DecimalFormat("0.00");
		
       Student s1=getStudentDetails();
       s1.calculateAvg();
       s1.findGrade();
       System.out.println("Id: "+s1.getId());
       System.out.println("Name: "+s1.getName());
       System.out.println("Average: "+df.format(s1.getAvg()));
       System.out.println("grade: "+s1.getGrade());
	}
	
	public static Student getStudentDetails()
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Id:");
		int id=sc.nextInt();
		System.out.println("Enter Name: ");
		String name1=sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter the number of subjects: ");
		int n=sc.nextInt();
		int sub[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter marks for subject "+i+":");
			sub[i]=sc.nextInt();
		}
		
		Student s1=new Student(id,name,sub);
		
		return s1;
		
	}

}
