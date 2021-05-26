import java.util.Scanner;
public class Basic
{
     
	public static void main(String[] args) 
	{
	    char b;
	  int c;
	 double d; 
	Scanner s = new Scanner(System.in);
	
	 System.out.println("enter your gender");
	    b = s.next().charAt(0);
	    System.out.println("enter your age ");
		c = s.nextInt();
		System.out.println("enter your phone number");
		d = s.nextDouble();
	
	System.out.println(" gender is " +b);
	System.out.println(" age is " +c);
	System.out.println(" phonenumber " +d); 
	}
}
