package lib;

import java.io.*;
import bookinfo.Book;

public class Library extends Book
{
	int bookQuantity;          //store number of books required
    String bName;               // stores name of the book to lend
    
    int ch;
    char option;
	public Library()
	{
		super();
		bookQuantity = 0;
		bName = null;
	}	
	public void calc()throws IOException
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		super.setInfo();
		do
		{ 
			super.show();
            System.out.println("1.Find the available qualtity of a book");
            System.out.println("2.Take a book");
            System.out.println("3.Exit");
			ch = Integer.parseInt(stdin.readLine());	
			switch (ch)
			{ 
				case 1:
					System.out.println("Enter name of the book : ");
					bName = stdin.readLine();
					int copies = checkBook(bName);
					if(copies == 10)
						System.out.println("Book not found");
					else
						System.out.println("Book Name: "+bName + "\nStock: "+super.stock[copies]);
					break;
				case 2:
					System.out.println("Enter name of the book and number of copies to lend: ");
					bName = stdin.readLine();
					bookQuantity = Integer.parseInt(stdin.readLine());
					int temp = checkBook(bName);
					if(temp == 10)
						System.out.println("Book not found");
					else if(bookQuantity > super.stock[temp])
						System.out.println("Insufficient stock");
					else
					{
						super.stock[temp]-= bookQuantity;
						System.out.println(super.stock[temp]+" copies of book "+bName+" lent successfully.");
					}
					break;
				case 3:
					System.exit(0);
					break;
				default: 
				System.out.println("Invalid Input...");
				break;
            }
            System.out.println("Do you want to try again ? (y/n)");
            option = stdin.readLine().charAt(0);
		}while(option == 'y' || option == 'Y');
	}
	public int checkBook(String bname)
	{
        int i;
		for(i = 0; i < 10; i++){
			if((super.bookName[i]).equalsIgnoreCase(bname))
				break;
		}
		return i;
	}
}	