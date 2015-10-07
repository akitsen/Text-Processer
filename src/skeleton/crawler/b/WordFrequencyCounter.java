package skeleton.crawler.b;


import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import skeleton.crawler.a.Frequency;
import skeleton.crawler.a.Utilities;

/**
 * Counts the total number of words and their frequencies in a text file.
 */
public final class WordFrequencyCounter {
	/**
	 * This class should not be instantiated.
	 */
	private WordFrequencyCounter() {}
	
	/**
	 * Takes the input list of words and processes it, returning a list
	 * of {@link Frequency}s.
	 * 
	 * This method expects a list of lowercase alphanumeric strings.
	 * If the input list is null, an empty list is returned.
	 * 
	 * There is one frequency in the output list for every 
	 * unique word in the original list. The frequency of each word
	 * is equal to the number of times that word occurs in the original list. 
	 * 
	 * The returned list is ordered by decreasing frequency, with tied words sorted
	 * alphabetically.
	 * 
	 * The original list is not modified.
	 * 
	 * Example:
	 * 
	 * Given the input list of strings 
	 * ["this", "sentence", "repeats", "the", "word", "sentence"]
	 * 
	 * The output list of frequencies should be 
	 * ["sentence:2", "the:1", "this:1", "repeats:1",  "word:1"]
	 *  
	 * @param words A list of words.
	 * @return A list of word frequencies, ordered by decreasing frequency.
	 */
	public static <T extends Comparable<T>> List<Frequency<T>> computeWordFrequencies(List<T> tokens) {
		
		List<Frequency> result = new ArrayList<Frequency>();
		if (tokens == null)
			return result;
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (T s : tokens) {
			if (map.containsKey(s))
				map.put(s, map.get(s) + 1);
			else
				map.put(s, 1);
		}
		
		Set<Map.Entry<String, Integer>> s = map.entrySet();
		for (Map.Entry<String, Integer> e : s)
			result.add(new Frequency(e.getKey(), e.getValue()));
		
		Collections.sort(result, new FrequencyComparator());
		return result;
		 
	}
	

	/**
	 * Runs the word frequency counter. The input should be the path to a text file.
	 * 
	 * @param args The first element should contain the path to a text file.
	 */
	public static void main(String[] args) {
		File file = new File("chapter1.txt");
		List<String> words = Utilities.tokenizeFile(file);
		List<Frequency<String>> frequencies = computeWordFrequencies(words);
		
		BufferedWriter log = null;
		try{
			log = new BufferedWriter(new OutputStreamWriter(System.out));
			Utilities.printFrequencies(log,frequencies);
		}
		finally{
			if(log != null){
				try {
					log.flush();
				} catch (IOException e) {
				}
				finally{
					try{
						log.close();
					} catch (IOException e) {
					}
				}
			}
		}
	}
}
