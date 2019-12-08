package callback;

public interface Callback {
	void Callback(int param);

}
package callback;
public class Client implements Callback {
	public void Callback(int param) {
		System.out.println("callback called with"+param);
	}
}
package callback;
public class Testface {
	public static void main(String args[]) {
		Callback c=new Client();
		c.Callback(42);
	}
}
