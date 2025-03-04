import java.util.Scanner;
class trainsearch
{
	public void search(int trainno)
	{
		System.out.println("enter trainno"+trainno);
		System.out.println("train searching done successfully via train number");
	}
	public void search(String trainname)
	{
		System.out.println("enter trainname"+trainname);
		System.out.println("train searching done successfully via train name");
	}
}
class maintrainsearch
{
	public static void main(String [] args)
	{
		Scanner scn=new Scanner(System.in);
		trainsearch t1=new trainsearch();
		System.out.println("1.search via train number\n2.search via train name");
		System.out.println("please make a choice");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1:System.out.println("enter trainno");
			int trainno=scn.nextInt();
			t1.search(trainno);
			break;
			case 2:System.out.println("enter trainname");
			String trainname=scn.next();
			t1.search(trainname);
			break;
			default:System.out.println("invalid choice");
		}
	}
}