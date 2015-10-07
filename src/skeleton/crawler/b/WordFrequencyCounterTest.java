package skeleton.crawler.b;

import static org.junit.Assert.assertEquals;

import java.io.BufferedWriter;
import java.io.File;
import java.io.OutputStreamWriter;
import java.util.List;

import org.junit.Test;

import skeleton.crawler.a.Frequency;
import skeleton.crawler.a.Utilities;

public class WordFrequencyCounterTest {

	@Test
	public void test() {
		File file = new File("test/in_01.txt");
		List<String> words = Utilities.tokenizeFile(file);
		List<Frequency<String>> f = WordFrequencyCounter.computeWordFrequencies(words);
		Utilities.printFrequencies(new BufferedWriter(new OutputStreamWriter(System.out)),f);
		assertEquals(26,f.size());
		assertEquals("a",f.get(0).getToken());
		assertEquals(1,f.get(0).getFrequency());
		assertEquals("m",f.get(12).getToken());
		assertEquals(1,f.get(12).getFrequency());
		assertEquals("z",f.get(25).getToken());
		assertEquals(1,f.get(25).getFrequency());
		
		file = new File("test/in_02.txt");
		words = Utilities.tokenizeFile(file);
		f = WordFrequencyCounter.computeWordFrequencies(words);
		Utilities.printFrequencies(new BufferedWriter(new OutputStreamWriter(System.out)),f);
		assertEquals(26,f.size());
		assertEquals("aa",f.get(0).getToken());
		assertEquals(1,f.get(0).getFrequency());
		assertEquals("mm",f.get(12).getToken());
		assertEquals(1,f.get(12).getFrequency());
		assertEquals("zz",f.get(25).getToken());
		assertEquals(1,f.get(25).getFrequency());
		
		file = new File("test/in_03.txt");
		words = Utilities.tokenizeFile(file);
		f = WordFrequencyCounter.computeWordFrequencies(words);
		Utilities.printFrequencies(new BufferedWriter(new OutputStreamWriter(System.out)),f);
		assertEquals(138,f.size());
		assertEquals("that",f.get(0).getToken());
		assertEquals(13,f.get(0).getFrequency());
		assertEquals("not",f.get(12).getToken());
		assertEquals(5,f.get(12).getFrequency());
		assertEquals("years",f.get(137).getToken());
		assertEquals(1,f.get(137).getFrequency());
		
		file = new File("test/in_04.txt");
		words = Utilities.tokenizeFile(file);
		f = WordFrequencyCounter.computeWordFrequencies(words);
		Utilities.printFrequencies(new BufferedWriter(new OutputStreamWriter(System.out)),f);
		assertEquals(40,f.size());
		assertEquals("0",f.get(0).getToken());
		assertEquals(2,f.get(0).getFrequency());
		assertEquals("6",f.get(12).getToken());
		assertEquals(1,f.get(12).getFrequency());
		assertEquals("words",f.get(39).getToken());
		assertEquals(1,f.get(39).getFrequency());
		
		file = new File("test/in_05.txt");
		words = Utilities.tokenizeFile(file);
		f = WordFrequencyCounter.computeWordFrequencies(words);
		Utilities.printFrequencies(new BufferedWriter(new OutputStreamWriter(System.out)),f);
		assertEquals(20,f.size());
		assertEquals("a",f.get(0).getToken());
		assertEquals(1,f.get(0).getFrequency());
		assertEquals("o",f.get(12).getToken());
		assertEquals(1,f.get(12).getFrequency());
		assertEquals("v",f.get(19).getToken());
		assertEquals(1,f.get(19).getFrequency());
		
		file = new File("test/in_06.txt");
		words = Utilities.tokenizeFile(file);
		f = WordFrequencyCounter.computeWordFrequencies(words);
		Utilities.printFrequencies(new BufferedWriter(new OutputStreamWriter(System.out)),f);
		assertEquals(658,f.size());
		assertEquals("the",f.get(0).getToken());
		assertEquals(81,f.get(0).getFrequency());
		assertEquals("palindrome",f.get(12).getToken());
		assertEquals(13,f.get(12).getFrequency());
		assertEquals("your",f.get(657).getToken());
		assertEquals(1,f.get(657).getFrequency());
	}
	/*
	Total item count: 26
	Unique item count: 26

	a	1
	b	1
	c	1
	d	1
	e	1
	f	1
	g	1
	h	1
	i	1
	j	1
	k	1
	l	1
	m	1
	n	1
	o	1
	p	1
	q	1
	r	1
	s	1
	t	1
	u	1
	v	1
	w	1
	x	1
	y	1
	z	1
	Total item count: 26
	Unique item count: 26

	aa	1
	bb	1
	cc	1
	dd	1
	ee	1
	ff	1
	gg	1
	hh	1
	ii	1
	jj	1
	kk	1
	ll	1
	mm	1
	nn	1
	oo	1
	pp	1
	qq	1
	rr	1
	ss	1
	tt	1
	uu	1
	vv	1
	ww	1
	xx	1
	yy	1
	zz	1
	Total item count: 272
	Unique item count: 138

	that	13
	the	11
	we	10
	here	8
	to	8
	a	7
	and	6
	can	5
	for	5
	have	5
	it	5
	nation	5
	not	5
	of	5
	dedicated	4
	in	4
	this	4
	are	3
	dead	3
	great	3
	is	3
	people	3
	shall	3
	so	3
	they	3
	us	3
	who	3
	be	2
	but	2
	conceived	2
	dedicate	2
	devotion	2
	far	2
	field	2
	from	2
	gave	2
	living	2
	long	2
	men	2
	new	2
	on	2
	or	2
	our	2
	rather	2
	these	2
	war	2
	what	2
	which	2
	above	1
	add	1
	advanced	1
	ago	1
	all	1
	altogether	1
	any	1
	as	1
	battle	1
	before	1
	birth	1
	brave	1
	brought	1
	by	1
	cause	1
	civil	1
	come	1
	consecrate	1
	consecrated	1
	continent	1
	created	1
	detract	1
	did	1
	died	1
	do	1
	earth	1
	endure	1
	engaged	1
	equal	1
	fathers	1
	final	1
	fitting	1
	forget	1
	forth	1
	fought	1
	four	1
	freedom	1
	full	1
	god	1
	government	1
	ground	1
	hallow	1
	highly	1
	honored	1
	increased	1
	larger	1
	last	1
	liberty	1
	little	1
	live	1
	lives	1
	measure	1
	met	1
	might	1
	never	1
	nobly	1
	nor	1
	note	1
	now	1
	perish	1
	place	1
	poor	1
	portion	1
	power	1
	proper	1
	proposition	1
	remaining	1
	remember	1
	resolve	1
	resting	1
	say	1
	score	1
	sense	1
	seven	1
	should	1
	struggled	1
	take	1
	task	1
	testing	1
	their	1
	those	1
	thus	1
	under	1
	unfinished	1
	vain	1
	whether	1
	will	1
	work	1
	world	1
	years	1
	Total item count: 47
	Unique item count: 40

	0	2
	a	2
	it	2
	right	2
	t	2
	this	2
	you	2
	1	1
	2	1
	3	1
	4	1
	5	1
	6	1
	78	1
	9	1
	are	1
	but	1
	code	1
	correctly	1
	count	1
	did	1
	don	1
	embedded	1
	few	1
	file	1
	have	1
	if	1
	in	1
	is	1
	not	1
	of	1
	or	1
	sentence	1
	testing	1
	the	1
	then	1
	way	1
	whether	1
	won	1
	words	1
	Total item count: 20
	Unique item count: 20

	a	1
	aa	1
	baab	1
	bab	1
	cbaabc	1
	cbabc	1
	dcbaabcd	1
	dcbabcd	1
	edcbaabcde	1
	edcbabcde	1
	m	1
	n	1
	o	1
	p	1
	q	1
	r	1
	s	1
	t	1
	u	1
	v	1
	Total item count: 1513
	Unique item count: 658

	the	81
	in	51
	a	44
	and	26
	of	25
	palindromes	24
	to	23
	as	21
	are	20
	is	19
	2	14
	or	13
	palindrome	13
	1	12
	that	12
	word	12
	edit	11
	at	10
	be	10
	by	10
	7	9
	i	9
	s	9
	english	8
	k	8
	l	8
	m	8
	was	8
	with	8
	3	7
	it	7
	also	6
	an	6
	arabic	6
	da	6
	from	6
	may	6
	n	6
	same	6
	this	6
	v	6
	w	6
	who	6
	can	5
	d	5
	examples	5
	go	5
	letters	5
	line	5
	on	5
	only	5
	ra	5
	st	5
	t	5
	unit	5
	up	5
	4	4
	century	4
	character	4
	each	4
	famous	4
	first	4
	for	4
	found	4
	h	4
	here	4
	literature	4
	not	4
	poem	4
	read	4
	sentence	4
	so	4
	such	4
	verse	4
	which	4
	ancient	3
	backward	3
	but	3
	consonants	3
	f	3
	font	3
	forward	3
	four	3
	greek	3
	honey	3
	include	3
	language	3
	latin	3
	least	3
	no	3
	one	3
	palindromic	3
	phrase	3
	poetry	3
	quran	3
	rak	3
	ran	3
	reading	3
	reads	3
	referred	3
	sa	3
	sak	3
	sanskrit	3
	sator	3
	see	3
	some	3
	square	3
	stanzas	3
	tamil	3
	they	3
	verses	3
	vowels	3
	wandering	3
	written	3
	ya	3
	19th	2
	5	2
	6	2
	again	2
	all	2
	arepo	2
	around	2
	article	2
	b	2
	back	2
	backwards	2
	bottom	2
	canal	2
	churches	2
	citations	2
	consontants	2
	cordiality	2
	crabs	2
	create	2
	dadas	2
	dadav	2
	dan	2
	date	2
	dav	2
	describe	2
	direction	2
	doctor	2
	down	2
	e	2
	either	2
	evil	2
	example	2
	fakabbir	2
	farsi	2
	film	2
	fire	2
	form	2
	girum	2
	god	2
	ha	2
	has	2
	hav	2
	his	2
	history	2
	if	2
	inscription	2
	instead	2
	j	2
	ka	2
	known	2
	la	2
	last	2
	left	2
	letter	2
	lindon	2
	lived	2
	madam	2
	man	2
	most	2
	musical	2
	na	2
	non	2
	often	2
	panama	2
	patient	2
	persian	2
	plan	2
	puranam	2
	r	2
	rabbaka	2
	ras	2
	represented	2
	right	2
	saw	2
	second	2
	shiva	2
	spacing	2
	stanza	2
	suffolk	2
	tadumu	2
	text	2
	there	2
	these	2
	top	2
	toyota	2
	transl	2
	translated	2
	translates	2
	types	2
	vadha	2
	way	2
	we	2
	were	2
	whose	2
	work	2
	yak	2
	yas	2
	11	1
	17th	1
	1960s	1
	2007	1
	36	1
	40	1
	74	1
	79	1
	7th	1
	8th	1
	abbey	1
	abjad	1
	able	1
	abode	1
	abraham	1
	acoustics	1
	ad	1
	adding	1
	additional	1
	adorned	1
	ages	1
	alive	1
	allies	1
	alluding	1
	also9	1
	although	1
	am	1
	amore	1
	andare	1
	anom	1
	anonymous	1
	another	1
	ans	1
	appear	1
	appears	1
	army	1
	arranged	1
	ash	1
	ate	1
	avtan	1
	baptismal	1
	basilica	1
	bats	1
	battle	1
	beautiful	1
	behavior	1
	being	1
	below	1
	ben	1
	beseeches	1
	best	1
	biological	1
	biology2	1
	bodes	1
	brought	1
	buried	1
	burned	1
	byzantine	1
	c	1
	calamities	1
	called	1
	canto	1
	capitalization	1
	car	1
	cat	1
	cave	1
	cf	1
	challenged	1
	characters	1
	church	1
	circle	1
	city	1
	civic	1
	classes	1
	classical	1
	clearly	1
	clover	1
	coined	1
	college	1
	column	1
	comics2	1
	common	1
	community	1
	complex	1
	complexity	1
	composing	1
	computation	1
	considerable	1
	consist	1
	consists	1
	constantinople	1
	constrained	1
	consumed	1
	consumimur	1
	contained	1
	contains	1
	contended	1
	content2	1
	contents	1
	continuation	1
	continued	1
	could	1
	couplets	1
	crab	1
	credited	1
	cries	1
	dammit	1
	depends	1
	despite	1
	destroyed	1
	devil	1
	devotee	1
	devotional	1
	diacritics	1
	diagonally	1
	different	1
	discerned	1
	disregarding	1
	do	1
	doppelganger	1
	dromos	1
	dulwich	1
	earlier	1
	earliest	1
	easily	1
	effort	1
	egres	1
	elba	1
	elements	1
	eleven	1
	encyclopedia	1
	enemies	1
	engraving	1
	epic	1
	epigraf	1
	er	1
	ere	1
	erupts	1
	essex	1
	et	1
	eva	1
	experimented	1
	explained	1
	external	1
	ezra	1
	face	1
	fact	1
	falak	1
	familiar	1
	fi	1
	fly	1
	follow	1
	following	1
	fonts	1
	forth	1
	free	1
	french	1
	fully	1
	g	1
	gaits	1
	geese	1
	ghanta	1
	giro	1
	give	1
	glorify	1
	glutton	1
	graffito	1
	greeks	1
	hadleigh	1
	halachic	1
	hang	1
	harlow	1
	have	1
	hawlin	1
	heard	1
	hebrew	1
	help	1
	hence	1
	herculaneum	1
	him	1
	hog	1
	holds	1
	horizontally	1
	however	1
	hyphen	1
	ibn	1
	igni	1
	ignored	1
	improve	1
	impurities	1
	imus	1
	incinerated	1
	included	1
	including	1
	incomparable	1
	indicates	1
	inscribed	1
	instruments	1
	interpreted	1
	into	1
	inversion	1
	iran	1
	ire	1
	italian	1
	its	1
	jar	1
	jonson	1
	jump	1
	kaaronap	1
	kama	1
	kanchi	1
	kanda	1
	karkinik	1
	karkinoi	1
	kavis	1
	kayak	1
	kir	1
	knapton	1
	kosher	1
	kullu	1
	kullun	1
	landing	1
	lasagna	1
	lasts	1
	level	1
	likely	1
	likulli	1
	lines	1
	linguistics	1
	links	1
	literal	1
	literally	1
	live	1
	london	1
	long	1
	lord	1
	low	1
	ludgate	1
	lyrics2	1
	ma	1
	maalai	1
	maatru	1
	mad	1
	madhava	1
	magha	1
	mahavidvaan	1
	makes	1
	malayalam	1
	many	1
	martin	1
	mary	1
	mata	1
	material	1
	mawaddatihi	1
	mawaddatuhu	1
	meaning	1
	medieval	1
	meenakshi	1
	menin	1
	metal	1
	mid	1
	middle	1
	ministry	1
	molecular	1
	more	1
	moths	1
	mounts	1
	movement	1
	mr	1
	music	1
	music2	1
	my	1
	names	1
	names2	1
	nan	1
	nandi	1
	nasa	1
	navigation	1
	needs	1
	new	1
	night	1
	nitba	1
	nixon	1
	nocte	1
	noon	1
	norfolk	1
	note	1
	nottingham	1
	number	1
	numbers2	1
	nut	1
	occasional	1
	occur	1
	opera	1
	orbit	1
	orl	1
	other	1
	out	1
	owl	1
	palin	1
	palindromatic	1
	palindromes2	1
	palindromes4	1
	palindromes8	1
	paris	1
	part	1
	perashnu	1
	pets	1
	phenomenon	1
	phrases	1
	phrases2	1
	pillai	1
	plays	1
	please	1
	poetry1	1
	popular	1
	popularized	1
	practice	1
	proceed	1
	properties	1
	property	1
	ps	1
	psi	1
	psin	1
	pson	1
	punctuation	1
	pure	1
	question	1
	quran1	1
	racecar	1
	radar	1
	rather	1
	rats	1
	re	1
	recreational	1
	redder	1
	redirects	1
	refer	1
	references10	1
	referring	1
	refers	1
	reliable	1
	relished	1
	remarkable	1
	removed	1
	respectively	1
	reversal	1
	reverse	1
	reversible	1
	reviver	1
	rid	1
	rjun	1
	roma	1
	roots	1
	rotas	1
	rotor	1
	runs	1
	said	1
	saint	1
	salami	1
	sambandhar	1
	sanskrit1	1
	santa	1
	scale	1
	search	1
	selfless	1
	semordnilap7	1
	semordnilaps	1
	sequence	1
	several	1
	shaivism	1
	shebad	1
	shivagnana	1
	shown	1
	simply	1
	single	1
	sins	1
	sirkazhi	1
	snakes	1
	sophia	1
	sources	1
	sower	1
	stab	1
	star	1
	step	1
	stephen	1
	striving	1
	strolling	1
	structures5	1
	students	1
	style	1
	sugar	1
	sundaram	1
	swimming	1
	symbols	1
	taken	1
	taking	1
	television	1
	tenet	1
	than	1
	their	1
	them	1
	theory6	1
	thirunaagaik	1
	thus	1
	times	1
	titles	1
	transliterates	1
	treif	1
	tuna	1
	unit2	1
	unsourced	1
	using	1
	usually	1
	various	1
	vash	1
	vast	1
	veena	1
	venisraf	1
	verification	1
	vertically	1
	vishnu	1
	visible	1
	volcano	1
	wahal	1
	wash	1
	ways	1
	weigh	1
	well	1
	wheels	1
	where	1
	whether	1
	wikipedia	1
	will	1
	words	1
	worlingworth	1
	worm	1
	would	1
	writer	1
	writing	1
	x	1
	y	1
	year	1
	yields	1
	yogi	1
	your	1
*/

}

