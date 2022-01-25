package practice;
import java.util.*;

public class forloop {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number whose table you want to print:");
		int a=input.nextInt();
		int i,j;
		for(i=1; i<=10; i++)
		{
			j=a*i;
			System.out.println(a+"*"+i+"="+j);
		}

	}

}
