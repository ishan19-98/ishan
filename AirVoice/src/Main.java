import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Name:");
		String name=sc.nextLine();
		System.out.println("Enter the ContactNumber:");
	    long contactNumber=sc.nextLong();
		System.out.println("Enter the EmailId:");
		String emailId=sc.nextLine();
		System.out.print("Enter the Age:");
		int age=sc.nextInt();
		
		Customer c = new Customer();
		c.setCustomerName(name);
		c.setContactNumber(contactNumber);
		c.setEmailId(emailId);
		c.setAge(age);
		
		System.out.println("Name:"+c.getCustomerName());
		System.out.println("Contact:"+ c.getContactNumber());
		System.out.println("emailId:"+c.getEmailId());
		System.out.println("age:"+c.getAge());
		
		sc.close();
	}

}
