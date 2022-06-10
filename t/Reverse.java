
public class Reverse {

	public static void main(String[] args) {
		
		String name = "ramakrishnan";
		String word = "";
		
		//char c[] = name.toCharArray();
		for(int i = name.length()-1;i>=0;i--) {
			
			word+=name.charAt(i);
		}
	System.out.println(word);

	}

}
