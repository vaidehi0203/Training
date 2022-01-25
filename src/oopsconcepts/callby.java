package oopsconcepts;

//This program shows how call by value and call by refferance works


public class callby {
	int p,q;
	
	public int sum(int a , int b) {
		int c;
		a=30;
		b=40;
		c=a+b;
		return(c);
	}
	
	public void swap(callby t) {
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		
	}

	public static void main(String[] args) {
		
		int x=10;
		int y=20;    //call by value
		callby c1=new callby();
		System.out.println(c1.sum(x,y));
		System.out.println("x is:"+x);
		System.out.println("y is :"+y);
		c1.p=4;
		c1.q=7;
		c1.swap(c1);
		System.out.println(c1.p);
		System.out.println(c1.q);
		
		

	}

}
