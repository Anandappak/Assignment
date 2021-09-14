
public class MakePurchase extends Payment implements Runnable {
	synchronized public void run()
	{
		if(wallet==0)
		{
			System.out.println("You have Insufficient wallet");
		}
		else
		{
		System.out.println("you eligble to Purchase");
		}
	}

}
