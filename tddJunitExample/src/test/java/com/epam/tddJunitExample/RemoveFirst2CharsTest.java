package com.epam.tddJunitExample;

import  static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class RemoveFirst2CharsTest {
   /*
    * TODO list for my feature
    * 1. first char : "ABCD" => "BCD" - success 
    * 2. first 2 chars : "AACD" => "CD" - success
    * 3. second char : "BACD" => "BCD" - success
    * 4. no char : "BBAA" => "BBAA" - success
    * 5. n chars : "AABAA" => "BAA" - success
    * 6. 1 char : "A" => "" - success
    * 7. 2 chars : "AA" => "" - success
    * 8. empty char : "" => "" - success
    */
	
	RemoveFirst2Chars removeFirst2Chars;
	
	@BeforeEach
	void setUp() {
		removeFirst2Chars =new RemoveFirst2Chars();
	}
	
	
	@Test
	void testFirstChar() {
		assertEquals("BCD",removeFirst2Chars.remove("ABCD"));
	}
	
	@Test
	void testFirst2Chars() {
		assertEquals("CD",removeFirst2Chars.remove("AACD"));
	}
	
	@Test
	void testSecondChar() {
		assertEquals("BCD",removeFirst2Chars.remove("BACD"));
	}
	
	@Test
	void testnoChars() {
		RemoveFirst2Chars removeFirst2Chars =new RemoveFirst2Chars();
		String actual = removeFirst2Chars.remove("BBAA");
		assertEquals("BBAA",actual);
	}
	
	@Test
	void testnChars() {
		assertEquals("BAA",removeFirst2Chars.remove("AABAA"));
	}
	
	@Test
	void test1Char() {
		assertEquals("",removeFirst2Chars.remove("A"));
	}
	
	@Test
	void test2Chars() {
		assertEquals("",removeFirst2Chars.remove("AA"));
	}
	
	@Test
	void testEmptyChar() {
		assertEquals("",removeFirst2Chars.remove(""));
	}
}
