import java.util.Scanner;
class input7
{
	public static void main(String[]args)
	{
		Scanner Scn=new Scanner(System.in);
		System.out.print("Enter base ");
		double base=Scn.nextDouble();
		System.out.print("enter height");
		double height=Scn.nextDouble();
		double area=0.5*base*height;
		System.out.print("area="+area);
	}
}	
