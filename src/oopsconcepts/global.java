package oopsconcepts;

//This program shows what is global and local variables.
//This program shows how static keyword is used and static variable and methods can be accesed without making object of that class. 


public class global {
	
	   int a=9;     // global (can be used using object) 
	 static int b=5; 
	 static int f=8;   // can be used without making object
	 
	   public void sum(int a,int b) {
		   int c;
		  
		   c=a+b;
		   System.out.println(c);
	   }

	public static void main(String[] args) {
		
		int m=89;
		String s="Vaidehi";
		global g=new global();
		System.out.println(g.a);
		System.out.println(b);
		System.out.println(m);
		
		System.out.println(s);
		g.sum(g.a,b);
		System.out.println(minus(b,f));

	}
	
	static int minus(int b,int f) {     // can be used without making object
		int s;
		s=f-b;
		return(s);
	}

}
