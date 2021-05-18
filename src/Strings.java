
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Javatraining";
		System.out.println(a.charAt(5));
		System.out.println("char at index "+a.indexOf("J"));
		System.out.println(a.substring(2));
		System.out.println(a.substring(0, 4));
		System.out.println(a.concat(" completed"));
		System.out.println(a.trim());
		//System.out.println(a.strip());
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		String sp[] =a.split("t");
		System.out.println(sp[0]);
		System.out.println(sp[1]);
		System.out.println(a.replace("a","s" ));
		
		
		

	}

}
