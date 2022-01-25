package oopsconcepts;


//This program shows the use of "This" keyword which reffers to the object.

public class This {
	
	int l;
	int b;
	
	This(int length){               //Constructor with One Parameter.
		this.l=length;
		this. b=length;
		System.out.println("The length of square is :"+ l);
		area();                            // constructor calls method
		
	}
	
	This(int length,int breadth){          //Constructor with two Parameter.
		this.l=length;
		this.b=breadth;
		
		System.out.println("\n");
		System.out.println("The lenth of Rectangle is :"+l);
		System.out.println("The breadth of Rectangle is :"+b);
		area();                        // constructor calls method	
	}
	
	
	
	void area() {
		int a;
		a=l*b;
		System.out.println("The area is : "+ a);
	}
	
	
	
	public static void main(String args[]) {
		
		
		This t2=new This(4);
		This t3=new This(5,6);
		
		
	}

}

