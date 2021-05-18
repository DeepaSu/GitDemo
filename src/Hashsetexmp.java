import java.util.HashSet;
import java.util.Iterator;

public class Hashsetexmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("India");
		hs.add("UK");
		//System.out.println(hs);
		hs.add("Iti");
		System.out.println(hs);
		/*System.out.println(hs.contains("US"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		//hs.remove("India");
		System.out.println(hs);*/
		
		Iterator<String> i = hs.iterator();
		
			while(i.hasNext())
			{
				System.out.print(i.next() + ",");
			}
			
		
		
		
		

	}

}
