package oopsconcepts;

//This program shows how Scanner class can be used to take the input from the users.

import java.util.*;
public class scanner {
	
	 static int l;

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		
		System.out.println("Enter the first number: ");
	    int a=input.nextInt();
	    System.out.println("You have entered a="+a);
	    System.out.println("Enter the second number: ");
	    int b=input.nextInt();
	    System.out.println("You have entered b="+b);
     int c= a+b;
     System.out.println("The sum of these two number is :"+c);
     System.out.println("enter l");
     l=input.nextInt();
     System.out.println("you have entered: "+l);
}
}