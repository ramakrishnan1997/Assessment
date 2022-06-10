import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
try
{
	FileWriter fw=new FileWriter("/home/vastpro/Bala/FileTask.txt",true);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("I'll run ahead and warn them.");
	bw.write("\n I committed an error in this");
	bw.write("\n The council had also a fatal defect in its constitution.");
	bw.write("\n Good Success");
	bw.close();
	System.out.println("saved success");
	FileReader fr=new FileReader("/home/vastpro/Bala/FileTask.txt");
	BufferedReader br=new BufferedReader(fr);
	String s=null;
	while ((s=br.readLine())!=null)
	{
		
		if(s.equals("warn") || s.equals("error") || s.equals("fatal")) {
			
			
			FileWriter fw1=new FileWriter("/home/vastpro/Bala/FileTask3.txt",true);
			fw1.write(s);
			System.out.println(s);
		}
		else {
			System.out.println("ram is playboy");
		}
	}
	
}
catch(IOException e)
{
	System.out.println(e);
}
	}

}
