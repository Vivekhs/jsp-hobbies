package main.java;


class MyThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Test{
	
	public static void main(String args[]) {
		Thread t1 = new Thread();
		t1.start();
		Thread t2 = new Thread();
		t2.start();
		while (true) {
		   try {
		      t1.join();
		      t2.join();
		      break;
		   } catch (InterruptedException e) {
		      e.printStackTrace();
		   }
		}
	}
}