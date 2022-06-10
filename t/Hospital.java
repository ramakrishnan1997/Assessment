
public class Hospital implements Billable {

	
	String Hospitalname;
	String Hospitaladdress;
	long phonenumber;
	int Hospitalbill;
	double fees;
	
	
	public Hospital(){
		
		Hospitalname = "jk_hospital";
		Hospitaladdress = "nk_street";
		phonenumber = 9564875484l;
		Hospitalbill = 50000;
		fees = 5000.00;
		
		
	}

	public Hospital(String Hospitalname, String Hospitaladdress, long phonenumber,int Hospitalbill,double fees) {
		
		this.Hospitalname = Hospitalname;
		this.Hospitaladdress = Hospitaladdress;
		this.phonenumber = phonenumber;
		this.Hospitalbill = Hospitalbill;
		this.fees = fees;
	
	}
	public String display() {
		
		return "Hospitalname -"+Hospitalname+"Hospitaladdress - "+Hospitaladdress+"phonenumber -"+phonenumber;
	}
	public String getDetails() {
		
		return "Hospital name - "+Hospitalname+"  "+"Hospital address - "+Hospitaladdress+" "+ "phonenumber -"+phonenumber;
	
		
	}
	
 public double calculatedBill() {
	 
	 return fees;
	 
 }

	public String displayBillDetails() {
		
		return "Billdetails - "+fees;
	}
	
	
	

}
