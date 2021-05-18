import java.util.ArrayList;
import java.util.HashMap;

public class dee {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList ,LinkedList,Vector --> Implementing List Interface
		//Array have fixed size where as array list can grow dynamically
		//you can access add / delet any elemnet at any index.
		//accepts duplicate values
	ArrayList<String> a = new ArrayList<String>();
	a.add("Deepa");
	a.add("Nani");
	a.add(0, "Suri");
	a.add("deepa");
	System.out.println(a);
	System.out.println(a.contains("nani"));
	//a.remove(1);
	//System.out.println(a);
	System.out.println(a.get(2));
	System.out.println(a.indexOf("Deepa"));
	System.out.println(a.size());
	
	
	
	
}
}


	