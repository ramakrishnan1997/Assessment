import java.io.*;

public class Compile {

	public static void main(String[] args) {
		try {
			/*
		File folder = new File ("demo");
		if(!folder.exists())
			folder.mkdir();
		
		
		FileWriter fw = new FileWriter ("demo/sample.txt");
		BufferedWriter bw = new BufferedWriter(fw,5000);
			bw.write("this is a sample");
			
			bw.write("have a great afternoon");
		
			bw.close();
			System.out.println("Data Saved");
			*/
			FileReader fr = new FileReader("/home/vastpro/Desktop/Laptop.java");
			FileWriter fw = new FileWriter("/home/vastpro/Desktop/Laptop1.java");
			BufferedReader br = new BufferedReader(fr);
			String str = null;
			
			
			while ((str = br.readLine())!= null) 
			{
				
				System.out.println(str);
				
		
		}
			br.close();
	
		
	}
   catch(IOException i) {
	
	System.out.println(i.getMessage());
}
	}
}

