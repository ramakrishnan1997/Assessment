
public class CarMain {

	public static void main(String[] args) {
		
		Car c = new Car(62584, 2012);
	c.setRegNumber(25124);
	
	c.setModel(1254);
	
	System.out.println(c.getRegNumber());
		
		
		Car c1 = new Car(62584, 2012);
		c1.setRegNumber(12456);
		System.out.println(c1.getRegNumber());
		System.out.println(c.getCount());
	}

}
