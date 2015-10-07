package skeleton.crawler.d;

import static org.junit.Assert.assertEquals;

import java.io.BufferedWriter;
import java.io.File;
import java.io.OutputStreamWriter;
import java.util.List;

import org.junit.Test;

import skeleton.crawler.a.Frequency;
import skeleton.crawler.a.Utilities;

public class PalindromeFrequencyCounterTest {

	@Test
	public void test() {
		File file = new File("test/in_01.txt");
		List<String> words = Utilities.tokenizeFile(file);
		List<Frequency<String>> f = PalindromeFrequencyCounter.computePalindromeFrequencies(words);
		Utilities.printFrequencies(new BufferedWriter(new OutputStreamWriter(System.out)),f);
		assertEquals(0,f.size());
		
		file = new File("test/in_02.txt");
		words = Utilities.tokenizeFile(file);
		f = PalindromeFrequencyCounter.computePalindromeFrequencies(words);
		Utilities.printFrequencies(new BufferedWriter(new OutputStreamWriter(System.out)),f);
		assertEquals(0,f.size());
		
		file = new File("test/in_03.txt");
		words = Utilities.tokenizeFile(file);
		f = PalindromeFrequencyCounter.computePalindromeFrequencies(words);
		Utilities.printFrequencies(new BufferedWriter(new OutputStreamWriter(System.out)),f);
		assertEquals(4,f.size());
		assertEquals("hereh",f.get(0).getToken());
		assertEquals(3,f.get(0).getFrequency());
		assertEquals("illli",f.get(3).getToken());
		assertEquals(1,f.get(3).getFrequency());
		
		file = new File("test/in_04.txt");
		words = Utilities.tokenizeFile(file);
		f = PalindromeFrequencyCounter.computePalindromeFrequencies(words);
		Utilities.printFrequencies(new BufferedWriter(new OutputStreamWriter(System.out)),f);
		assertEquals(0,f.size());
		
		file = new File("test/in_05.txt");
		words = Utilities.tokenizeFile(file);
		f = PalindromeFrequencyCounter.computePalindromeFrequencies(words);
		Utilities.printFrequencies(new BufferedWriter(new OutputStreamWriter(System.out)),f);
		assertEquals(6,f.size());
		assertEquals("cbaabc",f.get(0).getToken());
		assertEquals(1,f.get(0).getFrequency());
		assertEquals("dcbabcd",f.get(3).getToken());
		assertEquals(1,f.get(3).getFrequency());
		assertEquals("edcbabcde",f.get(5).getToken());
		assertEquals(1,f.get(5).getFrequency());
		
		file = new File("test/in_06.txt");
		words = Utilities.tokenizeFile(file);
		f = PalindromeFrequencyCounter.computePalindromeFrequencies(words);
		Utilities.printFrequencies(new BufferedWriter(new OutputStreamWriter(System.out)),f);
		assertEquals(60,f.size());
		assertEquals("refer",f.get(0).getToken());
		assertEquals(7,f.get(0).getFrequency());
		assertEquals("amanaplanacanalpanama",f.get(12).getToken());
		assertEquals(1,f.get(12).getFrequency());
		assertEquals("wasitacaroracatisaw",f.get(59).getToken());
		assertEquals(1,f.get(59).getFrequency());
	}
/*
Total item count: 0
Unique item count: 0

Total item count: 0
Unique item count: 0

Total item count: 6
Unique item count: 4

hereh	3
anyna	1
heseh	1
illli	1
Total item count: 0
Unique item count: 0

Total item count: 6
Unique item count: 6

cbaabc	1
cbabc	1
dcbaabcd	1
dcbabcd	1
edcbaabcde	1
edcbabcde	1
Total item count: 75
Unique item count: 60

refer	7
rever	3
atoyota	2
bbakafakabb	2
itati	2
madam	2
mwdthtdwm	2
sitis	2
umimu	2
aamanaplanacanalpanamaa	1
ablewasiereisawelba	1
agohangasalamiimalasagnahoga	1
amanaplanacanalpanama	1
amoreroma	1
anutforajaroftuna	1
asantalivedasadevilatnasa	1
atoyotasatoyota	1
civic	1
dammitimmad	1
datihitad	1
datuhutad	1
dogeeseseegod	1
erare	1
erere	1
erracecarre	1
ersre	1
es8se	1
evacanistabbatsinacave	1
hebeh	1
ingirumimusnocteetconsumimurigni	1
kasak	1
kayak	1
kinik	1
klfyflk	1
llall	1
maisasselflessasiam	1
malayalam	1
mmatamm	1
mrowlatemymetalworm	1
mwdthtdwmlklhwlwhlklmwdthtdwm	1
naman	1
noton	1
noxinnixon	1
onacloverifaliveeruptsavastpureevilafirevolcano	1
onano	1
radar	1
ratsliveonnoevilstar	1
rbkfkbr	1
redder	1
reher	1
reviver	1
rlevelr	1
rotor	1
rsesr	1
sakarananarakas	1
satorarepotenetoperarotas	1
steponnopets	1
terpret	1
ttobott	1
wasitacaroracatisaw	1
*/
}
