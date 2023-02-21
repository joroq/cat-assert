package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	
	@Test
	public void testFeeding() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		cat.feeds();
		assertEquals(cat.howHungry(), 30);
	}
	
	@Test
	public void testRuns() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		cat.runs();
		assertEquals(cat.howHungry(), 80);
	}
	
	@Test
	public void testCatDies() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		cat.runs();
		cat.runs();
		assertTrue(!cat.isAlive());
	}
}