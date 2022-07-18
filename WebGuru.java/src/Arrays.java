
public class Arrays {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		for(int i=0; i<=4;i++)
		{
			System.out.println(arr[i]);

		}
		
		/*int arr[] = {10,20,30,40,50};
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);*/
		
		
		/*int arr[] = new int[5]; // Inserting Values Into an Array
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);*/
		
		String s1 = "Hello Sailendra Reddy";
		
		String res[] = s1.split("o");
		System.out.println(res.length);

		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);

		}


	}

}
