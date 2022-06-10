import java.util.Scanner;

public class Arraynumber {

	public static void main(String[] args) {

		int total = 0;
		int product = 1;
		int smallestnumber = 0;
		int greatestnumber = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the 10 number");
		int ai[] = new int[10]; // array instance syntax

		for (int i = 0; i < 10; i++) {
			ai[i] = sc.nextInt(); // get the inputs
		}
		smallestnumber = ai[0];
		greatestnumber = ai[0];
		for (int j = 0; j < 10; j++) {

			total = total + ai[j];
			product = product * ai[j];
			if (smallestnumber > ai[j]) {
				smallestnumber = ai[j];
			}
			if (greatestnumber < ai[j]) {
				greatestnumber = ai[j];
			}
		}
		System.out.println(total);
		System.out.println(product);
		System.out.println(smallestnumber);
		System.out.println(greatestnumber);

	}
}
