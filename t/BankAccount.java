
public  class BankAccount {

	long accountnumber;
	String holdername;
	String id;
	int amount;
	
	public BankAccount() {
		
		accountnumber = 123456789l;
		holdername = "balamurugan";
		id = "iob4256";
		amount = 50000;
		
	}

	public BankAccount(long accountnumber, String holdername, String id, int amount) {
		
		this.accountnumber = accountnumber;
		this.holdername = holdername;
		this.id = id;
		this.amount = amount;
	}

public String display () {
	return "Account number = "+accountnumber+"\n"+"Holdername - "+holdername+"\n"+"id - "+id+"\n"+"amount - "+amount;
}

public void show() {
	// TODO Auto-generated method stub
	
}

//@Override
//public void transactionDetails() {
	// TODO Auto-generated method stub
	

	
}




