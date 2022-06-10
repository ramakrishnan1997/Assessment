import java.io.*;
import com.train.work.Student;

import array.BankAccount;
public class DesterlizationStudent {

	public static void main(String[] args) {
		
		try {
			
			String filename = "Student.txt";
			FileInputStream c = new FileInputStream(filename);
			ObjectInputStream d = new ObjectInputStream(c);
		    Student e2 =(Student)d.readObject(); //typecasting
			c.close();
		    d.close();
		    System.out.println("object has been initilized "+ "data before the Deserilization done");;
		   System.out.println(e2.display());
		}
catch(IOException | ClassNotFoundException ek) {
			
			System.out.println(ek);
			
			}

	}

}
