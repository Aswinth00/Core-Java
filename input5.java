import java.util.Scanner;
class input5
{
	public static void main(String[]args)
	{
		Scanner Scn=new Scanner(System.in);
		int sum=0;
		System.out.print("Enter a Value: ");
		int a=Scn.nextInt();
		System.out.println("a="+a);
		for (int i=1;i<=a;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.print(sum);
		
	}
}
