package skeleton.crawler.a;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.List;

import org.junit.Test;

public class UtilitiesTest {

	@Test
	public void test() {
		File file = new File("test/in_01.txt");
		List<String> words = Utilities.tokenizeFile(file);
		assertEquals(26,words.size());
		
		file = new File("test/in_02.txt");
		words = Utilities.tokenizeFile(file);
		assertEquals(26,words.size());
		
		file = new File("test/in_03.txt");
		words = Utilities.tokenizeFile(file);
		assertEquals(272,words.size());
		
		file = new File("test/in_04.txt");
		words = Utilities.tokenizeFile(file);
		assertEquals(47,words.size());
		
		file = new File("test/in_05.txt");
		words = Utilities.tokenizeFile(file);
		assertEquals(20,words.size());
		
		file = new File("test/in_06.txt");
		words = Utilities.tokenizeFile(file);
		assertEquals(1513,words.size());
	}
}
