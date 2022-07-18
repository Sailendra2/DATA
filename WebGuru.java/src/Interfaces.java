interface Hello
{
	int p = 10;
	//int q= 20;
	
	void show();
	void display();
	
}

 class B implements Hello
{ 
	 
	 
	public void show()
	{
		System.out.println("i am from show method in B");
	}
	
	public 	void display()
	{
		System.out.println("i am from display method in B");

	}

	
}
public class Interfaces {

	public static void main(String[] args) {
		
		B b1 = new B();
		b1.show();
		b1.display();
		
		
		
		
		}

}
