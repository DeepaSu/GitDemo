import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmapexmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		     hm.put(1, "Deepa");
		     hm.put(2, "SUresh");
		     hm.put(3,"Nani");
		     hm.put(4, "Balu");
		     System.out.println(hm);
		     
		    System.out.println(hm.containsKey(3));
		   hm.remove(4);
		   System.out.println(hm);
		   System.out.println(hm.get(1));
		   
		   Set sn= hm.entrySet();
		   Iterator it =sn.iterator();
		   while(it.hasNext())
		   {
			   Map.Entry mp = (Map.Entry)it.next();
			  System.out.println( mp.getKey());
			  System.out.println( mp.getValue());
		   }
		
		     
		
		
	}

}
