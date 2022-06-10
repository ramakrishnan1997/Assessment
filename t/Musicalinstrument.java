
public class Musicalinstrument {

	public static void main(String[] args) {
		String word = "";
		String arr[] = { "piano", "guitar", "flute", "drums" };

		for (int i = 0; i < arr.length; i++) {

			char ch[] = arr[i].toCharArray();

			for (int j = 0; j < ch.length; j++) {

				if (ch[j] != 'a' & ch[j] != 'e' & ch[j] != 'i' & ch[j] != 'o' & ch[j] != 'u')

					word = word + ch[j];
			}
			System.out.println("non-vowels - " + word + "\n");

			word = "";
		}

	}

}
