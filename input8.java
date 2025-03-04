import java.util.Scanner;
class input8
{
	public static void main(String[]args)
	{
		Scanner Scn=new Scanner(System.in);
		System.out.print("Enter a name ");
		String name=Scn.nextLine();
		System.out.println("enter id");
		int id=Scn.nextInt();
        System.out.println("Enter dob "+(dd/mm/yyy));
		String dob=Scn.next();
		System.out.println("Enter marks");
		float marks=Scn.nextFloat();
		System.out.print("Enter gender (m/f)");
		char gender=Scn.next().charAt(0);
		System.out.print("read to relocate");
		boolean relocate=Scn.nextBoolean();
		System.out.println("*******");
		System.out.println("name="+name);
		System.out.println("id="+id);
		System.out.println("dob="+dob);
		System.out.println("marks="+marks);
		System.out.println("gender="+gender);
		System.out.println("relocate="+relocate);
	}
}	

 