import java.util.Scanner;
class method7
{
    public static void main(String[]args)
	{
	    Scanner scn=new Scanner(System.in);
		System.out.println("ente n value");
		int n=scn.nextInt();
		print(n);
	}
	public static void print(int n)
	{
		System.out.println("=====================");
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}