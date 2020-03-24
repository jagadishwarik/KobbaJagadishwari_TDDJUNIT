package com.epam.tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveA {
RemoveAInFirst2Char removeAIn2Char;
	
	@BeforeEach
	void setUp() {
		removeAIn2Char = new RemoveAInFirst2Char();
	}

	@Test
	void testFirstChar() {
		assertEquals("BCD", removeAIn2Char.remove("ABCD"));
	}
	
	@Test
	void testSecondChar() {
		assertEquals("BCD", removeAIn2Char.remove("BACD"));
	}
	
	@Test
	void testBothChar() {
		assertEquals("BC", removeAIn2Char.remove("AABC"));
	}
	
	@Test
	void testNoChar() {
		assertEquals("BBAA", removeAIn2Char.remove("BBAA"));
	}
	
	@Test
	void testNChar() {
		assertEquals("BAA", removeAIn2Char.remove("AABAA"));
	}
	
	
	@Test
	void testEmpty() {
		assertEquals("", removeAIn2Char.remove(""));
	}
	
	@Test
	void testSingleChar() {
		assertEquals("", removeAIn2Char.remove("A"));
	}
	
	@Test
	void testAllChar() {
		assertEquals("AAA", removeAIn2Char.remove("AAAAA"));
	}

}