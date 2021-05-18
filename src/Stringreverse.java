
public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		String a= "Deepa";
		String t=" ";
	for(int i=a.length()-1;i>=0; i--)
		{
			t=t+a.charAt(i);
		}
		
		System.out.println(t);
		System.out.println(t.trim());
		
		if(a==t)
		{
			System.out.println("its a palindrome");
		}

		else
			System.out.println("Not a aplindrome");
		
	}
		

}

