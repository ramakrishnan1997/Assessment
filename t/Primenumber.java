import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner (System.in);
		
		int num,count = 0;
		System.out.println("enter the number");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			
			for (int j = 1; j <=i; j++) {
				if(i%j == 0){
					
					count++;
					
				}
			}
		
		if(count==2)
			
			System.out.println("prime number is "+i);
		count = 0;
		
	}

	}
}