
public interface Billable {
	
	String getDetails();
	double calculatedBill();
	String displayBillDetails();
	String display();
	default void show() {
		
		System.out.println("thank you visit again");
		
	}
	default void greetings() {
		
		System.out.println("good evening to all!!!!!");
	}
	
	

}
 
