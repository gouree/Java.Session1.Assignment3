
public class SwapTwoNumbers {
	public static void main(String args[])
	{
		int a=10,b=20;
		
		System.out.println("Value of a before swapping ="+a);
		System.out.println("Value of b before swapping ="+b);
		
		//swap		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Value of a after swapping ="+a);
		System.out.println("Value of a after swapping ="+b);
		
	}
}
