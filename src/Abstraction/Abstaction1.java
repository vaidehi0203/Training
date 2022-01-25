package Abstraction;

		// This program shows the concept of abstraction using abstract keyword.

		abstract class area{
			
			int b;
			int h;
			
			abstract void display();
			abstract void area();
			
				
			
		}


		public class Abstaction1 {

			public static void main(String args[]) {
				
				tri t = new tri();
			    rect r =new rect();
				
				t.b=4;
				t.h=5;
			    t.display();
				t.area();
				System.out.println("\n");
				r.b=4;
				r.h=6;
			    r.display();
				r.area();
				
			}
		}

	
