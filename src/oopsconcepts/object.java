package oopsconcepts;

//This program shows how object can be initialized and used.

public class object {
	
	int w;
	int d;
	int h;
	

	public static void main(String[] args) {
	 	 object s=new object();   //object() is an object
	 	 object t=new object();
    
		 
		 s.w=10;
		 s.d=8;
		 s.h=9;
		 System.out.println(s.w);
		 System.out.println(s.d);
		 System.out.println(s.h);
		 
		 t.d=s.d;
		 System.out.println(t.d);
	}

}

