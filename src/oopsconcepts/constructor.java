package oopsconcepts;

//This program shows how constructor works and different types of constructor like parameterless, parameterized constructor.


public class constructor {
	
	
	constructor(){
		System.out.println("Parameter less constructor");
	}
	
	constructor(int l){
		
		System.out.println("\n");
		System.out.println("Parameterized constructor ");
		System.out.println("The value is " +l);

	  	
	}
	
	constructor(int l,int b){

		System.out.println("\n");
		System.out.println("2 parameters");
		System.out.println("The value is "+ l + "&"  +  b);
	}
	
	

	public static void main(String[] args) {
		
		constructor c1=new constructor();
		constructor c2=new constructor(4);
		constructor c3=new constructor(5,6);
		

	}

}
           