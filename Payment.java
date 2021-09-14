import java.util.Scanner;

public class Payment implements Runnable {
	static float wallet,withdraw;
	Scanner scan;
	synchronized public void run()
	{
		System.out.println("Payment wallet service start ");
		  scan = new Scanner(System.in);
		 System.out.println("Enter the add amount to wallet ");
		  wallet = scan.nextFloat();
		  System.out.println("How much money want to draw");
			 withdraw=scan.nextFloat();
			 if(withdraw<=wallet)
			 {
				 System.out.println("succefull draw you amount");
				 System.out.println("");
			 }
			 else {
				 System.out.println("your account balance is low ");
			 }
		 
		 
	}

}
