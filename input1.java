import java.util.Scanner;
class input1
{
	public static void main(String[]args)
	{
		Scanner Scn=new Scanner(System.in);
		System.out.println("enter int value");
		int a=Scn.nextInt();
		System.out.println("a="+a);
        System.out.println("enter double value");
		double b=Scn.nextDouble();
		System.out.println("b="+b);
	    System.out.println("enter boolean value");
		boolean c=Scn.nextBoolean();
		System.out.println("c="+c);
	    System.out.println("enter char value");
		char d=Scn.next().charAt(0);
		System.out.println("d="+d);
	}
}


