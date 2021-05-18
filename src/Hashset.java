import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashset treeset, Linked Hashset implements set interface
		//Does not accept duplicate values.
		//Elements will not store in sequential order.
		
		HashSet<Integer> hs= new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		System.out.println(hs);
		hs.add(0);
		hs.add(4);
	/*	System.out.println(hs);
		System.out.println(hs.size());
		hs.add(4);
		//hs.remove(4);
		 System.out.println(hs);
		 
		System.out.println(hs.isEmpty());*/
		
		Iterator<Integer> i =hs.iterator();
		System.out.println(i.next());
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
		

	}

}
