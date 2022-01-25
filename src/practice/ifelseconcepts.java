package practice;
// program to find smallest / greatest number

public class ifelseconcepts {

	public static void main(String[] args) {
		int a=1000;
		int b=500;
		int c =1001;
		
		if(a>b && a>c)
		{
			System.out.println("a is the greatest number");
		}
		
		if(b>c && b>a)
		{
			System.out.println("b is the greatest number");
			
		}
		if(c>a && c>b)
		{
			System.out.println("c is the greatest number");
			
		}
		else
			
		System.out.println("\n");
	}
}
