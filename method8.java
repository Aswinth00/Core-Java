import java.util.Scanner;
class method8
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
		int count=0;
		for(int i=1; i<=n; i++)
		{
			if(i%6==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}