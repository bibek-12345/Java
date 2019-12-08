class A{
	int x,y;
	void showxy() {
		System.out.println("x="+x+"\ny="+y);
	}
}
class B extends A{
	int z;
	void showz(){
		System.out.println("z="+z);
		System.out.println("x+y+z="+(x+y+z));
	}
}
public class Inheritdemo{
	public static void main(String args[]) {
	A baseobjj=new A();
	B dervobjj=new B();
	baseobjj.x=10;
	baseobjj.y=20;
	System.out.println("contents of base class object");
	baseobjj.showxy();
	dervobjj.x=1;
	dervobjj.y=2;
	dervobjj.z=3;
	System.out.println("contents of derived class object");
	dervobjj.showxy();
	dervobjj.showz();
	}
}
