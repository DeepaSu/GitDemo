import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistExmp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(0, 50);
		al.remove(0);
		
	/*	for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		for(int num:al)
		{
			System.out.println(num);
		}*/
		
		Iterator<Integer> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		

	}

}
