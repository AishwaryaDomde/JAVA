package ThreadsPkg;

public class Impliment implements Runnable {
	public void run() {
		System.out.println("Hello World Implementing Runnable interface");
	}
	public static void main(String args[]) {
		Impliment I1=new Impliment();
		Thread t1 =new Thread(I1);
		t1.start();
	}
}
