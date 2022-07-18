
public class DaemonDemo extends Thread {
	
private int limit;
	
	public DaemonDemo(int limit, String name) {
		super(name);
		this.limit = limit;
	}
	
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int c=1; c<=limit; c++)
			System.out.println(name + ":" + c);
		}
		
	
	
		
		

	public static void main(String[] args) {
		
		DaemonDemo d1 = new DaemonDemo(25, "First");
		DaemonDemo d2 = new DaemonDemo(25, "Second");
		DaemonDemo d3 = new DaemonDemo(25, "Third");
		DaemonDemo d4 = new DaemonDemo(25, "Demon");
		

		d1.start();
		d2.start();
		d3.start();
		d4.start();


	}

}
