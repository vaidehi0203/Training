package practice;

public class array {

	public static void main(String[] args) {
		
		 int a[]=new int[3];
		 a[1]=1;
		 a[2]=a[1];
		
		 
		 for(int i=0;i<a.length;i++) {
			 
		 
		 System.out.println("a["+i+"]="+a[i]);
		 }
		 System.out.println("The length of array is" +a.length);
		 
		String s[]= new String[3];
			s[0]= "Hello";
		    s[1]="Vaidehi";
		    s[2]="Hii";
		    System.out.println(s.length);
		   
		    
		    for(int i=1;i<s.length;i++)
		    {
		    	s[0]=s[0];
		    	s[i]=s[i-1]+s[i];
		    	
		    	System.out.println(s[i]);
		    	System.out.println(s.length);
		    	System.out.println(s[i].length());
		    }
		   
		    
		
	}
	

}


/*for(int i=0;i<3;i=i+2) {


System.out.println("a["+i+"]="+a[i]);
}
*/
