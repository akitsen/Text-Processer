package skeleton.crawler.d;

import java.io.BufferedWriter;
import java.io.File;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import skeleton.crawler.a.Frequency;
import skeleton.crawler.a.Utilities;

public class PalindromeFrequencyCounter {
	/**
	 * This class should not be instantiated.
	 */
	private PalindromeFrequencyCounter() {}
	
	/**
	 * Takes the input list of words and processes it, returning a list
	 * of {@link Frequency}s.
	 * 
	 * This method expects a list of lowercase alphanumeric strings.
	 * If the input list is null, an empty list is returned.
	 * 
	 * There is one frequency in the output list for every 
	 * unique palindrome found in the original list. The frequency of each palindrome
	 * is equal to the number of times that palindrome occurs in the original list. Smaller palindromes
	 * within larger palindromes should not be separately counted.  Overlapping
	 * palindromes should be counted separately.
	 * 
	 * Palindromes can span sequential words in the input list.
	 * 
	 * The returned list is ordered by decreasing frequency, with tied palindromes sorted
	 * alphabetically. 
	 * 
	 * The original list is not modified.
	 *
	 * In a literary sense, palindromes end on word boundaries.  For our
	 * purposes palindromes can start and end within words.
	 *
	 * Only return palindromes longer than 5 characters.  Spaces do not count
	 * and should not be included in the returned list.
	 * 
	 * Example:
	 * 
	 * Given the input list of strings 
	 * ["do", "geese", "see", "god", "abba", "bat", "tab","xxbap","bat", "tab"]
	 * 
	 * The output list of palindromes should be 
	 * [ "battab:2", "abxxba:1", "dogeeseseegod:1"]
	 *  
	 * @param words A list of words.
	 * @return A list of palindrome frequencies, ordered by decreasing frequency.
	 */
	public static List<Frequency<String>> computePalindromeFrequencies(List<String> words) {
		// TODO Write body!
		// You will likely want to create helper methods / classes to help implement this functionality
		return null;
	}


	/**
	 * Same as computePalindromeFrequencies except it only includes palindromes
	 * that end on word boundaries.
	 * 
	 * Example:
	 * 
	 * Given the input list of strings 
	 * ["do", "geese", "see", "god", "abba", "bat", "tab","xxbap","bat", "tab"]
	 * 
	 * The output list of palindromes should be 
	 * [ "battab:2", "dogeeseseegod:1"]
	 *  
	 * @param words A list of words.
	 * @return A list of palindrome frequencies, ordered by decreasing frequency.
	 */
	public static List<Frequency<String>> computeWordAwarePalindromeFrequencies(List<String> words) {
		// TODO Optional for extra credit!
		return null;
	}
	
	/**
	 * Runs the palindrome finder. The input should be the path to a text file.
	 * 
	 * @param args The first element should contain the path to a text file.
	 */
	public static void main(String[] args) {
		File file = new File("chapter1.txt");
		ArrayList<String> words = Utilities.tokenizeFile(file);
		List<Frequency<String>> frequencies = computePalindromeFrequencies(words);
		Utilities.printFrequencies(new BufferedWriter(new OutputStreamWriter(System.out)),frequencies);
	}
}
