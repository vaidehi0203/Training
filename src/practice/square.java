package practice;

public class square {

	public static void main(String[] args) {
		int a[]=new int[6];
		
		for(int i=1;i<=a.length;i=i+2) {
		    
		    a[i]=i;
		    a[i]=a[i]*a[i];
		    a[i]=a[i]+a[i-1];
		    System.out.println(a[i]);
		    

	}

}
}
