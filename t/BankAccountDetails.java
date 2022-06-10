
public class BankAccountDetails {
	
	int accountnumber;
	String accountholdername;
	int amount;
	int balance = 20000;

	public BankAccountDetails(int accountnumber,String accountholdername,int amount) {
		
		this.accountnumber = accountnumber;
		this.accountholdername = accountholdername;
		this.amount = amount;
		
		
	}
	
	public void withdraw() throws UserDefinedException {
		
		if (amount > balance )
		{
			throw new UserDefinedException (balance);
		}
		else 
		{
			balance = balance - amount;

			System.out.println("current balance - "+balance);
		}
		
		
	}
   
		
	}
	

