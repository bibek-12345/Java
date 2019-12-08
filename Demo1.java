class Q{
	int n;
	boolean valueset=false;
	synchronized int get() {
		while(!valueset)
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("thread interrupted");
			}
		System.out.println("got:"+n);
		valueset=false;
		notify();
		return n;
	}
	synchronized void put(int n) {
		while(valueset) 
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("thread interrupted");
			}
		this.n=n;
		valueset=true;
		System.out.println("put:"+n);
		notify();
	}
}
class Producer implements Runnable{
	Q q;
	Producer(Q q){
		this.q=q;
		new Thread(this,"producer").start();
	}
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
		}
	}
}
class consumer implements Runnable{
	Q q;
	consumer(Q q){
		this.q=q;
		new Thread(this,"consumer").start();
	}
	public void run() {
		int i=0;
		while(true) {
			q.get();
		}
	}
}
public class Demo1 {
	public static void main(String args[]) {
		Q q=new Q();
		new Producer(q);
		new consumer(q);
		System.out.println("press ctrl+c to exit");
	}
}
