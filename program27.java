class program27
{
	public static void main(String[]args)
	{
		int num=9449;
		int copy=num;
		int rem=0;
		int rev=0;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("copy="+copy);
		System.out.println("rev="+rev);	
		if(copy==rev)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
	}
}