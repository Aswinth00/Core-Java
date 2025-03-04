class instagramv1
{
	public void login()
	{
		System.out.println("login done...");
	}
    public void reels()
	{
	    System.out.println("reels done!!");
	}
	public void sharepost()
	{
		System.out.println("sharepost done!!");
	}
	public void message()
	{
		System.out.println("message done!!");
	}
	public void like()
	{
		System.out.println("like done!!");
	}
	public void logout()
	{
		System.out.println("logout done!!");
	}
}	
class instagramv2 extends instagramv1
{
	@Override
	public void reels()
	{
		System.out.println("90 sec reels uploaded!!");
	}
	@Override
	public void sharepost()
	{
		System.out.println("instagram / whatsapp / Gmail / facebook!!");
	}
}
class mainofinstagram
{
	public static void main(String[]args)
	{
		System.out.println("verson1 done!!");
		System.out.println("----------------------");
		instagramv1 i1=new instagramv1();
		i1.login();
		i1.reels();
		i1.sharepost();
		i1.message();
		i1.like();
		i1.logout();
		System.out.println("\n\n");
		System.out.println("verson2 done!!");
		System.out.println("----------------------");
		instagramv2 i2=new instagramv2();
		i2.login();
		i2.reels();
		i2.sharepost();
		i2.message();
		i2.like();
		i2.logout();
	}
}