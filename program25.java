class program25
{
	public static void main(String[]args)
	{
		int num=88973241;
		int sum=0;
		int rem=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
}