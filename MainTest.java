
public class MainTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Payment c1 = new Payment();
		MakePurchase c2 = new MakePurchase();
		ViewBalance c3 = new ViewBalance();
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        Thread t3=new Thread(c3);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        
        t3.start();
        t3.join();
	}

}
