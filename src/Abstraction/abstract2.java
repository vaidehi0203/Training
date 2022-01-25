package Abstraction;

//This program contains the classes which has the declaration of abstract methods.

class tri extends area{
	 
	 int b=super.b;
	 int h=super.h;
	 
	     public void display() {
		              System.out.println("The b of traiangle is :"+b);
             		 System.out.println("The h of traiangle is :"+h);
	 }
	
	    public void area() {
  	         double a;
  	 
  	 a=(b*h)*0.5;
  	 System.out.println("The area is:"+a);
  	 
   }
  	 
  	 
}

class rect extends area{
	
	 int b=super.b;
	 int h=super.h;
	 
	 public void display() {
		 
		          System.out.println("The b of traiangle is :"+b);
		          System.out.println("The h of traiangle is :"+h);
	 }
	
	
    public void area() {
  	     double a;
 	         a=(b*h);
 	         System.out.println("The area is:"+a);
 	 
  }
  
 
}



