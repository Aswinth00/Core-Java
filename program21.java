class program21
{
	public static void main(String[]args)
	{
		int num=29;
		int count=0;
		for(int i=1; i<=num; i++)
		{
		if(num%i==0)
			{
				count ++;
			}
		}
		System.out.println("num="+num);
		System.out.println("count="+count);
		if(count==2)
		{
		System.out.println("the given number is prime number");
		}
		else
		{
		System.out.println("the given number is not prime number");	
		}
	
	}
	
}