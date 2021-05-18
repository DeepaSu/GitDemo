import java.util.ArrayList;

public class Arraylistpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		 a.add(1);
		 a.add(2);
		 a.add(3);
		 a.add(4);
		 System.out.println(a);
		 a.add(0, 0);
		 System.out.println(a);
		System.out.println(a.get(4));
		//a.clear();
	 //System.out.println(a);
		a.add(0,6);
		a.add(0,0);
		System.out.println(a);
		System.out.println(a.contains(9));
		System.out.println(a.get(1));
		System.out.println(a.isEmpty());
		a.remove(0);
		System.out.println(a);
		System.out.println(a.size());
		a.set(0, 0);
		System.out.println(a);
		
	 
		

	}

}
