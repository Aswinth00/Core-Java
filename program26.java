class program26
{
	public static void main(String[]args)
	{
		int num=948;
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
	}
}