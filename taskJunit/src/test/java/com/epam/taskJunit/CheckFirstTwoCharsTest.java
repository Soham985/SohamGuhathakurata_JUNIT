package com.epam.taskJunit;

import static org.junit.jupiter.api.Assertions.*;
/*
 * 1. "ABCD"=>"BCD"
 * 2. "AACD"=>"CD"
 * 3. "BACD"=>"BCD"
 * 4. "BBAA"=>"BBAA"
 * 5. "AABAA"=>"BAA"
 */

import org.junit.jupiter.api.Test;

class CheckFirstTwoCharsTest {

	@Test
	void test1() {
		CheckFirst2Chars checkfirst2chars=new CheckFirst2Chars();
		String actual=checkfirst2chars.check("ABCD");
		assertEquals("BCD",actual);
	}
	
	@Test
	void test2() {
		CheckFirst2Chars checkfirst2chars=new CheckFirst2Chars();
		String actual=checkfirst2chars.check("AACD");
		assertEquals("CD",actual);
	}
	
	@Test
	void test3() {
		CheckFirst2Chars checkfirst2chars=new CheckFirst2Chars();
		String actual=checkfirst2chars.check("BACD");
		assertEquals("BCD",actual);
	}
	
	@Test
	void test4() {
		CheckFirst2Chars checkfirst2chars=new CheckFirst2Chars();
		String actual=checkfirst2chars.check("BBAA");
		assertEquals("BBAA",actual);
	}
	
	@Test
	void test5() {
		CheckFirst2Chars checkfirst2chars=new CheckFirst2Chars();
		String actual=checkfirst2chars.check("AABAA");
		assertEquals("BAA",actual);
	}

}
