import java.util.Scanner;
class input6
{
	public static void main(String[]args)
	{
		Scanner Scn=new Scanner(System.in);
		System.out.print("Enter a Value: ");
		int a=Scn.nextInt();
		for (int i=1;i<=a;i++)
		{
			if(i%4==0)
			{
			 System.out.println(i);
			}
		}
	}
}	
