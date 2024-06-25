package Week1Assignments;

public class Printevennumbers {

	public static void main(String[] args) 
	
	
	{
		
		int i =0;
		
		for (i=1;i<=10;i++)
		{
          if(i%2==0)
          {
        	  if(i==6)
        	  {
        		  break;
        	  }
        	System.out.println("the given number" + " " +i+"is even");  
        	  
          }
          
          else if(i%2!=0)
          {
        	  continue;
          }
	}

}
}