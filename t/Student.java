import java.util.Scanner;

public class Student {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the student name");
	    String name = sc.next();
	    System.out.println("name of student - "+name);
	    System.out.println("  welcome "+name+" to the world of java");
		sc.close();
		
	}
	

}
