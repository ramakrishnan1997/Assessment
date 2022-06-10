import java.util.Scanner;

public class DemoBankException {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the account number");
			int ac = sc.nextInt();
			System.out.println("Enter the account holder name");
			String name = sc.next();
			System.out.println("Enter the amount");
			int amount  = sc.nextInt();
			//System.out.println("Enter the balance");
			///int balance  = sc.nextInt();
			
			BankAccountDetails a = new BankAccountDetails (ac,name,amount);
				a.withdraw();
			}
catch(UserDefinedException e) {
			
			System.out.println(e.display());
		}
		catch (Exception c) {
			System.out.println(c);
			
		}
	}

}
