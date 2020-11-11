package thread;

public class ThreadEx extends Thread {
	public static int amount = 0;

	  public static void main(String[] args) {
	    ThreadEx thread = new ThreadEx();
	    thread.start();
	    System.out.println(amount);
	    amount++;
	    System.out.println(amount);
	  }

	  public void run() {
	    amount++;
	  }
}
