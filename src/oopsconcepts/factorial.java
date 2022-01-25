package oopsconcepts;

// This program shows how factorial program can be solved using reccursion and for loop

public class factorial {
	
	public int fact(int n) {
		
		if(n==1) {
			return 1;
		}
		else 
			
			n=n*fact(n-1);
		return n;
	}

	public static void main(String[] args) {
		
			  factorial f=new factorial();
			  factorial f1=new factorial();
			  int n;
			  f.fact(4);
			  f1.fact1();
			  System.out.println("The output is="+f.fact(4));
			  System.out.println("The output is="+f1.fact1());

	}



  public int fact1() {
	  
	 int n=5;
	 int f=1;
	 for(int i=1;i<=5;i++) {
		 f=f*i;
	 }
	 return f;
  }
	  
  }