class pattern4
{
	public static void main(String[]args)
	{
		int a=1;
		char ch='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(ch + "\t");
					ch++;
				}
				else
				{
					System.out.print(a + "\t");
					a++;
				}
			}
			System.out.println();
		}
	}
}