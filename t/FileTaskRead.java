import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTaskRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
FileReader fr=new FileReader("/home/vastpro/Bala/FileTask1.txt");
BufferedReader br=new BufferedReader(fr);

String str=null;
while((str=br.readLine())!=null)
{
	if(str.equals("warn") || str.equals("error") || str.equals("fatal")) {
		
		System.out.println(str);
	}
	else {
		System.out.println("ram is good");
	}
}

	}
		catch(IOException e)
		{
			System.out.println(e);
		}

}
}