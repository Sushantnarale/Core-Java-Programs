package corePrograms;

public class ThreadMcq extends Thread {
	
	private ThreadMcq() {
		setName("I am Thread");
		setPriority(8);
	}
	 public void run() {
		 System.out.println("Run - "+Thread.currentThread().getName());
		 System.out.println("Run -"+Thread.currentThread().getPriority());
	 }
	public static void main(String[] args) {
		new ThreadMcq().start();
		System.out.println("Main- "+ Thread.currentThread().getPriority());
		System.out.println("Main- "+Thread.currentThread().getName());
	}

}