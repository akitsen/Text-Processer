package skeleton.crawler.a;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoGramTest {

	@Test
	public void testTwoGram() {
		TwoGram<Integer> p1 = new TwoGram<Integer>(1, 2);
		assertTrue(p1 != null);
		TwoGram<Double> p2 = new TwoGram<Double>(1.0,2.0);
		assertTrue(p2 != null);
		TwoGram<String> p3 = new TwoGram<String>("Hello", "World");
		assertTrue(p3 != null);
	}
	
	@Test
	public void testGetFirst() {
		TwoGram<String> p3 = new TwoGram<String>("Hello", "World");
		assertTrue(p3 != null);
		assertEquals("Hello", p3.getFirst());
	}
	

	@Test
	public void testGetSecond() {
		TwoGram<String> p3 = new TwoGram<String>("Hello", "World");
		assertTrue(p3 != null);
		assertEquals("World", p3.getSecond());
	}

	@Test
	public void testSetFirst() {
		TwoGram<String> p3 = new TwoGram<String>("Hello", "World");
		assertTrue(p3 != null);
		assertEquals("Hello", p3.getFirst());
		p3.setFirst("First");
		assertEquals("First", p3.getFirst());
	}

	@Test
	public void testSetSecond() {
		TwoGram<String> p3 = new TwoGram<String>("Hello", "World");
		assertTrue(p3 != null);
		assertEquals("World", p3.getSecond());
		p3.setSecond("Second");
		assertEquals("Second", p3.getSecond());
	}

	@Test
	public void testCompareTo() {
		TwoGram<String> p1 = new TwoGram<String>("Hello", "World");
		
		TwoGram<String> p2 = new TwoGram<String>("Hello", "World");
		assertEquals(0, p1.compareTo(p2));
		assertEquals(p1, p2);
		assertEquals(p1.hashCode(), p2.hashCode());

		TwoGram<String> p3 = new TwoGram<String>("ZHello", "World");
		assertTrue(p1.compareTo(p3) < 0);
		assertTrue(!p1.equals(p3));
		assertTrue(p1.hashCode() != p3.hashCode());

		TwoGram<String> p4 = new TwoGram<String>("AHello", "World");
		assertTrue(p1.compareTo(p4) > 0);
		assertTrue(!p1.equals(p4));
		assertTrue(p1.hashCode() != p4.hashCode());

		TwoGram<String> p5 = new TwoGram<String>("Hello", "ZWorld");
		assertTrue(p1.compareTo(p5) < 0);
		assertTrue(!p1.equals(p5));
		assertTrue(p1.hashCode() != p5.hashCode());

		TwoGram<String> p6 = new TwoGram<String>("Hello", "AWorld");
		assertTrue(p1.compareTo(p6) > 0);
		assertTrue(!p1.equals(p6));
		assertTrue(p1.hashCode() != p6.hashCode());

		assertEquals(p1, p1);
		assertEquals(p1.hashCode(), p1.hashCode());
		assertEquals(p2, p2);
		assertEquals(p2.hashCode(), p2.hashCode());
		assertEquals(p3, p3);
		assertEquals(p3.hashCode(), p3.hashCode());
		assertEquals(p4, p4);
		assertEquals(p4.hashCode(), p4.hashCode());
		assertEquals(p5, p5);
		assertEquals(p5.hashCode(), p5.hashCode());
		assertEquals(p6, p6);
		assertEquals(p6.hashCode(), p6.hashCode());

		assertTrue(!p1.equals(null));
		assertTrue(!p2.equals(null));
		assertTrue(!p3.equals(null));
		assertTrue(!p4.equals(null));
		assertTrue(!p5.equals(null));
		assertTrue(!p6.equals(null));

		assertTrue(!p1.equals("a"));
		assertTrue(!p2.equals(0L));
		assertTrue(!p3.equals(0.0d));
		assertTrue(!p4.equals(0));
		assertTrue(!p5.equals(new Object()));
		assertTrue(!p6.equals(true));

	}
	
	
	@Test
	public void testDegenerates() {
		TwoGram<String> p1 = new TwoGram<String>(null,null);
		TwoGram<String> p2 = new TwoGram<String>(null,null);

		assertEquals(1,p1.compareTo(null));
		assertEquals(0, p1.compareTo(p2));
		assertEquals(p1, p2);
		assertEquals(p1.hashCode(), p2.hashCode());
		
		TwoGram<String> p3 = new TwoGram<String>(null,"Hello");
		TwoGram<String> p4 = new TwoGram<String>(null,"Hello");

		assertEquals(0, p3.compareTo(p4));
		assertEquals(p3, p4);
		assertEquals(p3.hashCode(), p4.hashCode());
		
		TwoGram<String> p5 = new TwoGram<String>(null,null);
		TwoGram<String> p6 = new TwoGram<String>(null,"Hello");

		assertEquals(-1, p5.compareTo(p6));
		assertEquals(1, p6.compareTo(p5));
		assertTrue(!p5.equals(p6));
		assertTrue(p5.hashCode() != p6.hashCode());
		
		TwoGram<String> p7 = new TwoGram<String>(null,"World");
		TwoGram<String> p8 = new TwoGram<String>("Hello","World");

		assertEquals(-1, p7.compareTo(p8));
		assertEquals(1, p8.compareTo(p7));
		assertTrue(!p7.equals(p8));
		assertTrue(p7.hashCode() != p8.hashCode());

	}
}
