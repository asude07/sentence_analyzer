
public class SentenceAnalyzer {
	int b=1;

	public String[] tokenizeSentence(String sentence) {
		
		String[] words = new String[sentence.length()];
		
		words[0] = sentence.substring(0,sentence.indexOf(" "));
		
		
		for (int a=1; a<sentence.length(); a++) {
			if (sentence.charAt(a) == ' ') {
				words[b] = sentence.substring(a+1);
				b++;
			}
		}
		
		for (int i=1; i<b-1; i++) {
			words[i] = words[i].substring(0,words[i].indexOf(" "));
		}
		
//		String[] arr = new String[b];
//		
//		for (int i=0; i<b; i++) {
//			arr[i]=words[i];
//		}
		return words;
		
	}


}
