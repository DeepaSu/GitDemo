import java.util.HashSet;
import java.util.Iterator;

public class Hashsettraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> sh= new HashSet<String>();
		
		sh.add("a");
		sh.add("b");
		sh.add("c");
		//System.out.println(sh);
		sh.add("d");
		//System.out.println(sh);
		/*for(String str:sh)
		{
			System.out.println(str);
		}*/
		
		Iterator<String> st= sh.iterator();
		while(st.hasNext())
		{
			System.out.println(st.next());
		}
		
	}

}
