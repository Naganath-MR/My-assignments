package Week1Assignments;


import java.util.Scanner;

public class PalindromeForLoop 
	
	{
	
	public static void main(String[] args)
	{
	 
	  
	  
	  System.out.println("Enter a number");
	  Scanner scan = new Scanner(System.in);
	  int number=scan.nextInt();
	  scan.close();
	  
	  int input = number;
	  int rem=0;
	  int output=0;
	  
	  for(;number!=0;number/=10)
	  {
	
	  rem = number%10;        // 121 %10 = 1   | 12%10 = 2 	| 1%10 = 1
	  output = (output*10)+ rem;// (0*10)+1 = 1  | (1*10)+2 = 12 | (12*10)+1 = 121
	        // (121/10) = 12 | 12/10 = 1		| 1/10= 0
	  }
	  
	 if(input==output)
	  
	  {
		  System.out.println("palindrome number");
	  }
	  
	  else
	  {
		  System.out.println("Not palindrome number");
		  
	  }
	
	}
}
	