import java.util.Iterator;
import java.util.Scanner;

public class Supermarket {
	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the num value");
		int n=s.nextInt();
		System.out.println("Enter the num1 value");
		int v=s.nextInt();
		int num=n;
		int num1=v;
		int i;
		int res=0;
		
		for(i=num+1;i<num1;i++) {
			
				if(i%2==0) {
			System.out.println(i+"\n");
			res+=i;
			
			}
		}
		
		System.out.println("Total res ="+res);
		
		 
	}
	
	

}
