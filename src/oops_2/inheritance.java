package oops_2;

class square{
	int l=5;
	
	void display() {
		System.out.println("The length of square is:"+l);
	}
	
}

class area extends square{
	
	int a;
	
	public void area(){
		a=l*l;
		System.out.println("The area of square is :"+a);
	}
}


public class inheritance {
	
	public static void main(String args[]) {
		area a = new area();
		a.display();
		a.area();
	}

}
