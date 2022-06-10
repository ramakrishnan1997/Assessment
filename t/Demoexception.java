import java.util.Scanner;

public class Demoexception {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the candidate name");
		String name = sc.next();
		System.out.println("Enter the candidate age");
		int age  = sc.nextInt();
		
			Recuirtment re = new Recuirtment(name,age);
			re.recurit();
		}
		catch(InvalidAgeExcemption e) {
			
			System.out.println(e.display());
		}
		catch (Exception c) {
			System.out.println(c);
			
		}
	}

}
