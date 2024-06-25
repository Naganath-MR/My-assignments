package Week1Assignments;

public class Library

{
	int bookid;
	String bookname;
	int bookcost;
	

	String BookDisplay()
	{
		System.out.println(bookid+ " "+ bookname+ "  "+bookcost);
	
		return BookDisplay();
	}
	
String addBook(String booktitle) 
{
	System.out.println("Book added successfully");
	return booktitle;
}


void Issuebook() 
{
	System.out.println("book issued successfully");
	
	}

/*

public static void main(String[] args)

{
	
	Library obj1 = new Library();
	
	
	String S1 = obj1.addBook("booktitle");
	
	
	
	obj1.Issuebook();
}*/
}
