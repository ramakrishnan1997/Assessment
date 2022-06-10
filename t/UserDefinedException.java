
public class UserDefinedException extends Exception {
	
	int Balance;
	
	public UserDefinedException( int Balance) {
		
		this.Balance = Balance;
	}
	
public String display() {
	
	return "insufficient balance- "+Balance;
}
}
