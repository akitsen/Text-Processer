package skeleton.crawler.a;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A collection of utility methods for text processing.
 */
public class Utilities {
	/**
	 * Reads the input text file and splits it into alphanumeric tokens.
	 * Returns an ArrayList of these tokens, ordered according to their
	 * occurrence in the original text file.
	 * 
	 * Non-alphanumeric characters delineate tokens, and are discarded.
	 *
	 * Words are also normalized to lower case. 
	 * 
	 * Example:
	 * 
	 * Given this input string
	 * "An input string, this is! (or is it?)"
	 * 
	 * The output list of strings should be
	 * ["an", "input", "string", "this", "is", "or", "is", "it"]
	 * 
	 * @param input The file to read in and tokenize.
	 * @return The list of tokens (words) from the input file, ordered by occurrence.
	 */
	
	public static ArrayList<String> tokenizeFile(File input) {
		try {
			FileReader reader = new FileReader(input);
			ArrayList<String> result = new ArrayList<String>();
			StringBuilder word = new StringBuilder();
			
			int c = 0;
			while ((c = reader.read()) != -1) {
				int i = isAlphaNumeric(c);
				
				// numeric or lower case char
				if (i == 0 || i == 2)
					word.append((char)c);
				// upper case char, transfer to lower case char
				else if (i == 1)
					word.append((char)(c + 32));
				// token
				else {
					if (word.length() >= 2) {
						result.add(word.toString());
					}
					word.setLength(0);
				}
			}
			
			if (word.length() >= 2)
				result.add(word.toString());
			
			reader.close();
			return result;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static ArrayList<String> parseText(String text) {
		ArrayList<String> result = new ArrayList<String>();
		if (text == null)
			return result;
		
		char[] charArray = text.toCharArray();
		StringBuilder word = new StringBuilder();
		
		for (int i = 0; i < charArray.length; i++) {
			int c = isAlphaNumeric(charArray[i]);
			
			// numeric or lower case char
			if (c == 0 || c == 2)
				word.append((char)charArray[i]);
			// upper case char, transfer to lower case char
			else if (c == 1)
				word.append((char)(charArray[i] + 32));
			// token
			else {
				if (word.length() >= 2) {
					result.add(word.toString());
				}
				word.setLength(0);
			}
		}
		
		if (word.length() >= 2) {
			result.add(word.toString());
		}
		
		return result;
	}
	
	
	private static int isAlphaNumeric(int i) {
		if (i >= 48 && i <= 57)
			return 0; // number
		if (i >= 65 && i <= 90)
			return 1; // upper case
		if (i >= 97 && i <= 122)
			return 2; // lower case
		
		return -1; // not alphanumeric
	}

	/**
	 * Takes a list of {@link Frequency}s and prints it to out. It also
	 * prints out the total number of items, and the total number of unique items.
	 * 
	 * Example one:
	 * 
	 * Given the input list of word frequencies
	 * ["sentence:2", "the:1", "this:1", "repeats:1",  "word:1"]
	 * 
	 * The following should be printed to standard out
	 * 
	 * Total item count: 6
	 * Unique item count: 5
	 * 
	 * sentence	2
	 * the		1
	 * this		1
	 * repeats	1
	 * word		1
	 * 
	 * 
	 * Example two:
	 * 
	 * Given the input list of 2-gram frequencies
	 * ["you think:2", "how you:1", "know how:1", "think you:1", "you know:1"]
	 * 
	 * The following should be printed to standard out
	 * 
	 * Total item count: 6
	 * Unique item count: 5
	 * 
	 * you think	2
	 * how you		1
	 * know how		1
	 * think you	1
	 * you know		1
	 * @param <T>, the type of the thing whose frequencies you are counting
	 * 
	 * @param frequencies A list of frequencies.
	 */
	public static <T extends Comparable<T>> void printFrequencies(BufferedWriter out, List<Frequency<T>> frequencies) {
		// TODO Write body!
		int totalCount = 0;
		int uniqueCount = 0;
		
		boolean isTwoGram = true;
		
		for (Frequency f : frequencies) {
			totalCount += f.getFrequency();
			uniqueCount += 1;
		}
		
		if (frequencies.isEmpty() || !isTwoGram) {
			System.out.println("Total item count: " + totalCount);
			System.out.println("Unique item count: " + uniqueCount);
		}
		else {
			System.out.println("Total 2-gram count: " + totalCount);
			System.out.println("Unique 2-gram count: " + uniqueCount);
		}
		
		System.out.println();
		for (Frequency f : frequencies) {
			System.out.println(f.getToken() + "\t" + f.getFrequency());
		}
	}
	
	
}
