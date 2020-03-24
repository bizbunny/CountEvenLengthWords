package assignment2;

import algs4.StdIn;
import algs4.StdOut;
//Anh Nguyen
public class CountEvenLengthWords {

	public static void main(String[] args) {
		String textSource = "data/tale.txt";
		StdIn.fromFile(textSource);
		String bookText = StdIn.readAll();
		String[] bookWords = bookText.split("\\s+");
		int bookLen = bookWords.length;
		int bookEvenLen=0;
		for(int i = 0; i < bookLen; i++) {
			int wordLen = bookWords[i].length();
			if(wordLen%2==0) {
				bookEvenLen++;
			}
		}
		StdOut.println ("There are " + bookEvenLen + " words with an even length in " + textSource + ".");
	}

}
