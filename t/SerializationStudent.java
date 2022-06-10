import java.io.*;
import com.train.work.Student;


public class SerializationStudent {

	public static void main(String[] args) {
		
		Student e1 = new Student(123456,95,"civil","ba college");
		String filename = "Student.txt";  //storing the file as string
		
		try {
			
			FileOutputStream a = new FileOutputStream (filename);
		    ObjectOutputStream b =new ObjectOutputStream(a);
		    
		    b.writeObject(e1);
		    
		    a.close();
		    b.close();
		    System.out.println("object has been initilized "+ "data before the serilization done");;
			System.out.println(e1.display());
		}
catch(IOException ex) {
	
	System.out.println("IOException is caught");
	
	}
	

	}

}
