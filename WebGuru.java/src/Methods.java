
public class Methods {
	
	void printArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		
		Methods m = new Methods(); 
		
		int p[] = {10,20,30,40,50};
		m.printArray(p);
		
	}

}
