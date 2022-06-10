import java.util.Scanner;







public class Demohospital {

	public static void main(String[] args) {
	
	 
		
		
		/*Hospital hp = new Hospital();
		
		System.out.println(hp.getDetails());
		System.out.println(hp.displayBillDetails());
		*/
		
		Scanner sc = new Scanner (System.in);
		/*System.out.println("Enter the hospital name");
		String Hospitalname = sc.nextLine();
		System.out.println("Enter the hospital address");
		String Hospitaladdress = sc.nextLine();
		System.out.println("Enter the phonenumber");
		long phonenumber = sc.nextLong();
		System.out.println("Enter the Hospital bill");
		int Hospitalbill = sc.nextInt();
		System.out.println("Enter the Hospital fees");
		double fees = sc.nextDouble();
		Hospital hp = new Hospital(Hospitalname,Hospitaladdress,phonenumber,Hospitalbill,fees);
		hp.display();
		Billable bi1 = new Hospital();
		System.out.println(bi1.display());
		hp.show();
		hp.greetings();*/
		Scanner sc1 = new Scanner (System.in);
		System.out.println("enter the shop name");
		String shopname = sc1.nextLine();
		System.out.println("enter the shop address");
		String shopaddress = sc1.nextLine();
		System.out.println("enter the contact number");
		int contact_number = sc1.nextInt();
		System.out.println("enter the name of item1");
		String item1 = sc1.next();
		System.out.println("enter the name of item2");
		String item2 = sc1.next();
		System.out.println("enter the bill details");
		double billdetails = sc1.nextDouble();
		
		Shop sh = new Shop(shopname,shopaddress,contact_number, item1,item2,billdetails);
		System.out.println(sh.display());
		sh.show();
		sc1.close();
		
		
		
		
		
		
		
	}
	
	

}
