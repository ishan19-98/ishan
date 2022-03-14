package GradeCalculation;

import java.text.DecimalFormat;

public class Student {

	private int id;
	private String name;
	private int[] marks;
	private float avg;
	private char grade;
	
	
	
	public Student(int id, String name, int[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public  void calculateAvg()
	{
		int sum=0;
		
		int ar[]=getMarks();
		for(int i=0; i<getMarks().length; i++)
		{
			sum=sum+ar[i];
		}
		float avg1=(float)sum/ar.length;
		setAvg(avg1);
	}
	
	public void findGrade()
	{
		double avg1=getAvg();
		
		if(80<avg1 && avg1<100)
		{
			setGrade('O');
		}
		else if(avg1<50)
		{
			setGrade('F');
		}
		else
		{
			setGrade('A');
		}
	}
	
	
}
