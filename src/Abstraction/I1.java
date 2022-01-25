package Abstraction;

//This program contains the interface which has only methods without declaration.

public interface I1 {
	
	final int a=5;
	final int b=6;
	
	public void addition();
	public void subtraction();
	public void multiplication();

}



class a implements I1 {
	
	int c;
	
	public void addition() {
		c=a+b;
		System.out.println("The addition is: "+c);
	}
	
	public void subtraction() {
		
		c=b-a;
		System.out.println("The subtraction is: "+c);
	}
	
	public void multiplication() {
		
		c=a*b;
		System.out.println("The multiplication is: "+c);
	}

	
	
}
