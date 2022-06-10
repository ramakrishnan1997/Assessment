
public interface Transaction {
	
	void transactionDetails();

	public default void show() {
		
		System.out.println("THANK YOU AND VISIT AGAIN");
	}
		
}
