
import java.util.*;

public class DemoExcemption {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };
		Scanner sc = new Scanner(System.in);
		try {

			for (int i = 0; i < 5; i++) {

				System.out.println(arr[i]);

			}
		} catch (ArrayIndexOutOfBoundsException a) {

			System.out.println(a.getMessage());
		} catch (InputMismatchException b) {

			System.out.println("please enter the member only");
		} catch (Exception c) {
			System.out.println(c.getMessage());
		} finally {

			sc.close();
		}

		System.out.println("project completed");
	}

}
