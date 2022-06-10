import java.io.*;
public class Cheerful {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream f1 = new FileInputStream("/home/vastpro/eclipse-workspace3/Demo/sample/demo/sample.txt");
			FileOutputStream f2 = new FileOutputStream("/home/vastpro/eclipse-workspace3/Demo/sample/demo/sample1.txt");
			int i;
			while((i=f1.read()) != -1) {
				
			f2.write(i);
			}
			f1.close();
			f2.close();
		}
		catch(FileNotFoundException e) {
			
			e.printStackTrace();
			
		}
		catch(IOException i) {
			
			i.printStackTrace();
		}

	}

}

 