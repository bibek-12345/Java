/*Design and implement a java program to demonstrate constructor overloading and Method overloading*/
import java.util.*;
class Arithmetic {
	Scanner s1=new Scanner(System.in);
	int a,b;
	Arithmetic(){
		System.out.println("enter two integers\n");
		a=s1.nextInt();
		b=s1.nextInt();
	}
	void display() {
		System.out.println("add="+(a+b));
		System.out.println("sub="+(a-b));
		System.out.println("mul="+(a*b));
		System.out.println("div="+(a/b));
	}
	Arithmetic(float a1,float b1){
		System.out.println("add="+(a1+b1));
		System.out.println("sub="+(a1-b1));
		System.out.println("mul="+(a1*b1));
		System.out.println("div="+(a1/b1));
	}
	void display(int n) {
		System.out.println("the square of"+n+"is"+(n*n));
	}
}
class Main1{
	public static void main(String args[]) {
		Scanner s1=new Scanner(System.in);
	    System.out.println("Arithmetic operation on intger");
	    Arithmetic a=new Arithmetic();
	    a.display();
	    System.out.println("Arithmetic operation on float");
	    float a1=s1.nextFloat();
	    float b1=s1.nextFloat();
	    Arithmetic arth1=new Arithmetic(a1,b1);
	    System.out.println("enter number to find square");
	    int n=s1.nextInt();
	    a.display(n);
	}
}
