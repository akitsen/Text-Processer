package skeleton.crawler.c;

import java.io.BufferedWriter;
import java.io.File;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import skeleton.crawler.a.Frequency;
import skeleton.crawler.a.TwoGram;
import skeleton.crawler.a.Utilities;

/**
 * Count the total number of 2-grams and their frequencies in a text file.
 */
public final class TwoGramFrequencyCounter {
	/**
	 * This class should not be instantiated.
	 */
	private TwoGramFrequencyCounter() {}
	
	/**
	 * Takes the input list of words and processes it, returning a list
	 * of {@link Frequency}s.
	 * 
	 * This method expects a list of lowercase alphanumeric strings.
	 * If the input list is null, an empty list is returned.
	 * 
	 * There is one frequency in the output list for every 
	 * unique 2-gram in the original list. The frequency of each 2-grams
	 * is equal to the number of times that two-gram occurs in the original list. 
	 * 
	 * The returned list is ordered by decreasing frequency, with tied 2-grams sorted
	 * alphabetically. 
	 * 
	 * 
	 * 
	 * Example:
	 * 
	 * Given the input list of strings 
	 * ["you", "think", "you", "know", "how", "you", "think"]
	 * 
	 * The output list of 2-gram frequencies should be 
	 * ["you think:2", "how you:1", "know how:1", "think you:1", "you know:1"]
	 *  
	 * @param tokens A list of words.
	 * @return A list of two gram frequencies, ordered by decreasing frequency.
	 */
	public static <T extends Comparable<T>> List<Frequency<TwoGram<T>>> computeTwoGramFrequencies(List<T> tokens) {
		// TODO Write body!
		return null;
	}
	
	/**
	 * Runs the 2-gram counter. The input should be the path to a text file.
	 * 
	 * @param args The first element should contain the path to a text file.
	 */
	public static void main(String[] args) {
		File file = new File("chapter1.txt");
		ArrayList<String> words = Utilities.tokenizeFile(file);
		List<Frequency<TwoGram<String>>> frequencies = computeTwoGramFrequencies(words);
		Utilities.printFrequencies(new BufferedWriter(new OutputStreamWriter(System.out)),frequencies);
	}
}
