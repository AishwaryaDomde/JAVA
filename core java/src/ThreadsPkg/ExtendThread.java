package ThreadsPkg;

class ExtendThread extends Thread {
	public void run() {
		System.out.println("Hi hello World in thread");
	}
	public static void main(String []arga) {
		ExtendThread t1=new ExtendThread();
		t1.start();
	}
} 