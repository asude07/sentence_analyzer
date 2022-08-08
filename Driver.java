import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		SentenceAnalyzer s1 = new SentenceAnalyzer();
		Scanner key = new Scanner(System.in);
		String input;
		
		System.out.println("Enter a sentence: ");
		input = key.nextLine();
		
		String[] words = s1.tokenizeSentence(input);
		
		for (int i = 0; i < s1.b; i++) {
			
				System.out.println("Word " + (i+1) + ": " + words[i]);
			
		}
	}

}
