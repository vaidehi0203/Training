package oopsconcepts;

//This program shows the basic method and how to access that method using object.

public class method {
	
	void area(int l) {
		int a;
		a=l*l;
		System.out.println("The area of square is:"+a);
		
	}

	public static void main(String[] args) {
		method m=new method();
		
		m.area(5);
	}

}
