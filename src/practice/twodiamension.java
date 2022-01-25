package practice;

public class twodiamension {

	public static void main(String[] args) {
		int x[][]=new int[2][3];
				System.out.println(x.length);
		        System.out.println(x[0].length);
		        
		        System.out.println("\n");
		        
		        x[0][0]=23;
		        x[0][1]=34;
		        x[0][2]=33;
		        x[1][0]=21;
		        x[1][1]=67;
		        x[1][2]=32;
		        
		        
		        for(int i=0;i<x.length;i++)
		        {
		        	for(int j=0;j<x[0].length;j++) 
		        	{
		        		System.out.println(x[i][j]);
		        	}
		        }
		        	
	}

}
