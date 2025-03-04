class amazonv1
{
	public void login()
	{
		System.out.println("login done...");
	}
    public void pay()
	{
	    System.out.println("pay done!!");
	}
	public void shop()
	{
		System.out.println("shop done!!");
	}
	public void logout()
	{
		System.out.println("logout done!!");
	}
}	
class amazonv2 extends amazonv1
{
	@Override
	public void pay()
	{
		System.out.println("upi / card&cvv");
	}
	public void music()
	{
		System.out.println("music vibe!!");
	}
	public void prime()
	{
		System.out.println("watch a moves!!");
	}
}
class mainofamazon
{
	public static void main(String[]args)
	{
		System.out.println("verson1 done!!");
		System.out.println("----------------------");
		amazonv1 a1=new amazonv1();
		a1.login();
		a1.pay();
		a1.shop();
		a1.logout();
		System.out.println("!!----------------------!!");
		System.out.println("verson2 done!!");
		amazonv2 a2=new amazonv2();
		a2.login();
		a2.pay();
		a2.shop();
		a2.music();
		a2.prime();
		a2.logout();
	}
}