import java.io.*;
public class CompileJava {

	public static void main(String[] args) {
		try {
			
			File folder = new File ("/home/vastpro/eclipse-workspace3/Demo/sample/src/Integer.java");	
			if(!folder.exists());
			folder.mkdir();
			
			FileWriter fw = new FileWriter("(defautpackage)/Integer") ;
			BufferedWriter bw = new BufferedWriter(fw,2000);
                 
	        FileReader fr = new FileReader("/home/vastpro/eclipse-workspace3/Demo/sample/src/Integer.java");
			BufferedReader br = new BufferedReader(fr);
			String str = null;
			
			while ((str = br.readLine())!= null) 
			{
				
				System.out.println(str);
			
		}
		
}
		catch(IOException i) {
			
			System.out.println(i.getMessage());
		}	
		
	}
}
		
		

	


