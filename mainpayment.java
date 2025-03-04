import java.util.Scanner;
class amazonpayment
{
	public void payment()
	{
		System.out.println("amazonpayment done by cod");
	}
	public void payment(String upi)
	{
		System.out.println("enter upi"+upi);
		System.out.println("amazonpayment done by upi");
	}
	public void payment(long cardno,int cvv)
	{
		System.out.println("enter cardno"+cardno);
		System.out.println("enter cvv"+cvv);
		System.out.println("amazonpayment done by cardno and cvv");
	}
	public void payment(String username,String password)
	{
	    System.out.println("enter username"+username);
		System.out.println("enter password"+password);
	    System.out.println("amazonpayment done by username and password");
	}
}
class mainpayment
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		amazonpayment p1=new amazonpayment();
		System.out.println("1.enter via  cod\n2.enter via upi");
		System.out.println("please make a choice");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1:System.out.println("enter cod");
			       p1.payment();
			    break;
			case 2:System.out.println("enter username and password");
			       String username_password=scn.next();
			       p1.payment();
			break;
			default:System.out.println("invalid choice");
		}
	}
}
