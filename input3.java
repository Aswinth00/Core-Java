import java.util.Scanner;
class input3
{
	public static void main(String[]args)
	{
		Scanner Scn=new Scanner(System.in);
		System.out.print("Enter a Value: ");
		int a=Scn.nextInt();
		System.out.println("a="+a);
		for (int i=a;i>=1;i--)
		{
			if (i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
