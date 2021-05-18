
public class Forloop {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=0;i<4;i++) //(outer for loop) this block will loop for 4 times
		{
		System.out.println( "outer loop started");
		for(int j=5;j>=4;j--)
		{
			System.out.println("Hi");
		}
		}
	}

}

/*1
2 3
4 5 6 
7 8 9 10*/

