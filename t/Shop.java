
public class Shop implements Billable{
	
	String shopname;
	String shopaddress;
	int contact_number;
	String item1;
	String item2;
	double billdetails;
	
	
	public Shop(String shopname, String shopaddress, int contact_number, String item1, String item2,
			double billdetails) {
		
		this.shopname = shopname;
		this.shopaddress = shopaddress;
		this.contact_number = contact_number;
		this.item1 = item1;
		this.item2 = item2;
		this.billdetails = billdetails;
	}
	
	public String display() {
		
		return "Shop name - "+shopname+""+"shopaddress - "+shopaddress+""+"contact number -"+contact_number+"item1 -"+item1+""+"item2 - "+item2+"billdetails -"+billdetails;


	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculatedBill() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String displayBillDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


