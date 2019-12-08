public class Finallydemo {
	static void procA() {
		try {
				System.out.println("inside procA");
				throw new RuntimeException("Demo");
		}finally {
				System.out.println("procA's finally");
		}
	}
	static void procB() {
		try {
			System.out.println("inside procB");
			return;
		}
		finally {
			System.out.println("inside procB's finally");
		}
	}
	static void procC() {
		try{
			System.out.println("inside procC");
		}
		finally {
			System.out.println("inside procC's finally");
		}
	}
	public static void main(String args[])
	{
		try {
			procA();
		}catch(Exception e) {
			System.out.println("exception caught");
		}
		procB();
		procC();
	}
	
}
