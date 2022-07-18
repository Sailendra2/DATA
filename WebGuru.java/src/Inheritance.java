
 class A
{
	int p;
	
	public A() {
		
	}
	
	public A(int p)
	{
		this.p = p;
	}
	
	public void display()
	{
		System.out.println("my p values in class 'A' is:" + p);

	}
	
	
}

/*class B extends A
{
	int q;
	
	public B() {
		
	}
	
	public B(int p, int q)
	{
		this.p = p;
		this.q = q;
	}
	
	public void add()
	{
		System.out.println("my p,q values in class 'b' is:" + (p+q));

	}
	
	
}*/

/*class C extends A
{
	int r;
	
	public C() {
		
	}
	
	public C(int p, int r)
	{
		this.p = p;
		this.r = r;
	}
	public void sub()
	{
		System.out.println("my p,q values in class 'c' is:" + (p-r));

	}
	
}*/


public class Inheritance {

	public static void main(String[] args) {
		
		/*B b1 = new B(5,10);
		b1.add();*/
		
		/*C c1 = new C(10,20);
		c1.sub();*/
		
		A a1 = new A(10);
		a1.display();
		
		

	}

}
