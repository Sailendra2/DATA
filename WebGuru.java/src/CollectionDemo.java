import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("Microsoft");
		lst.add("Google");
		lst.addFirst("Apple");
		lst.addFirst("Apache");
		lst.add(2,"Oracle");
		
		System.out.println("--Iterating using for loop");
		for(int i=0; i<lst.size(); i++ )
			System.out.println(lst.get(i));
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("IBM");
		ar.add("Apple");
		ar.add("JBoss");
		
		ar.addAll(lst);
		System.out.println("--Iterating over Merged collection");
		for(String e:ar)
			System.out.println(e);
		
		HashSet<String> set  = new HashSet<String>(ar);
		System.out.println("--Iterating over set collection");
		for(String e:set)
			System.out.println(e);
		
		TreeSet<String> Tset1 = new TreeSet<String>(ar);
		System.out.println("--Iterating Sorted Order collection");
		for(String e:Tset1)
			System.out.println(e);





		}

}
