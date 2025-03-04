
class mobile
{
	String name;
	int price;
	String color;
	String brand;
	public mobile(String brand, String name,int price,String color)
	{
		this.name=name;
		this.price=price;
		this.color=color;
		this.brand=brand;
	}
}
class mainofmobile
{
	public static void main(String[]args)
	{
		mobile m1=new mobile("redmi","note11",5000,"black");
		mobile m2=new mobile("One+","nord",20000,"blue");
		mobile m3=new mobile("Oppo","F9",30000,"red");
		System.out.println("Brand\tNAME\t\tPRICE\t\tCOLOR");
		System.out.println("-----------------------------------------------------");
		System.out.println(m1.brand+"\t"+m1.name+"\t\t"+m1.price+"\t\t"+m1.color);
		System.out.println(m2.brand+"\t"+m2.name+"\t\t"+m2.price+"\t\t"+m2.color);
		System.out.println(m3.brand+"\t"+m3.name+"\t\t"+m3.price+"\t\t"+m3.color);
	}
}