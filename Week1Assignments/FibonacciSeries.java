package Week1Assignments;

public class FibonacciSeries {

	// 0 1 1 2 3 5 8 13
	public static void main(String[] args) {
		 int N1=0;
		 int N2=1;
		 int N3;
		 System.out.print(N1 + " " +N2);
		 for(int i=0;i<16;i++)
	{
		
		N3=N1+N2;
		System.out.print( " " +N3);
		N1=N2; 
		N2=N3; 
	}

}
}