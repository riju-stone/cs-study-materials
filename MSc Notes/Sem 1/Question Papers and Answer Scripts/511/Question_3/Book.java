package bookinfo;

public class Book 
{
	public int stock[];
	public String bookName[];
	public String pubName[];
	public Book()
	{
		stock=new int[10];
		bookName=new String[10];
		pubName=new String[10];
	}
	public void setInfo()
	{
		String btemp = "A B C D E F G H I J";
		String ptemp = "K L M N O P Q R S T";
		bookName = btemp.split(" ");
		pubName = ptemp.split(" ");
		for(int i=0;i<10;i++)
			stock[i]=(i+1)*5;
	}
	public void show()
	{
		System.out.println("Book \t Publisher \t Stock");
		for(int i=0;i<10;i++)
		{
			System.out.print(bookName[i]+"\t	"+pubName[i]+"\t  "+stock[i]+"\n");
		}
	}
}
	