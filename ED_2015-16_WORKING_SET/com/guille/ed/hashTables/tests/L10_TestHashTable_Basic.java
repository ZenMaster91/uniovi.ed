package com.guille.ed.hashTables.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.guille.ed.hashTables.HashTable;

public class L10_TestHashTable_Basic {

	@Test
	public void testHashingFunctionIntegers() {
		// Example
		HashTable<Integer> a = new HashTable<Integer>(5, HashTable.LINEAR_PROBING, 0.5);
		assertEquals(2, a.f(7, 0));
		assertEquals(3, a.f(7, 1));
		assertEquals(4, a.f(7, 2));
		assertEquals(0, a.f(7, 3));
		
		//System.out.println(a.f(4, 0));
				
		// Example
		HashTable<Integer> b = new HashTable<Integer>(5, HashTable.QUADRATIC_PROBING, 0.5);
		assertEquals(2, b.f(7, 0));
		assertEquals(3, b.f(7, 1));
		assertEquals(1, b.f(7, 2));
		assertEquals(1, b.f(7, 3));
	}
	
	
	@Test
	public void testHashingFunctionCharacters() {
		// Example
		HashTable<Character> a = new HashTable<Character>(5, HashTable.LINEAR_PROBING, 0.5);
		assertEquals(0, a.f('A', 0));
		assertEquals(1, a.f('A', 1));
		assertEquals(2, a.f('A', 2));
		assertEquals(3, a.f('A', 3));
				
		// Example
		HashTable<Character> b = new HashTable<Character>(5, HashTable.QUADRATIC_PROBING, 0.5);
		assertEquals(0, b.f('A', 0));
		assertEquals(1, b.f('A', 1));
		assertEquals(4, b.f('A', 2));
		assertEquals(4, b.f('A', 3));

	}
	
	
	@Test
	public void testHashTableAddSearchLP(){
		// Example
		HashTable<Integer> a = new HashTable<Integer>(5, HashTable.LINEAR_PROBING, 1.0);
		a.add(4);
		a.add(13);
		a.add(24);
		a.add(3);
			
		assertEquals("[0] (1) = 24 - [1] (1) = 3 - [2] (0) = null - [3] (1) = 13 - [4] (1) = 4 - ", a.toString());
		assertEquals(true, a.search(3));
		assertEquals(false, a.search(12));
	}
	
	
	@Test
	public void testHashTableAddSearchQP(){
		// Example
		HashTable<Integer> b = new HashTable<Integer>(5, HashTable.QUADRATIC_PROBING, 1.0);
		b.add(4);
		b.add(13);
		b.add(24);
		b.add(3);
				
		assertEquals("[0] (1) = 24 - [1] (0) = null - [2] (1) = 3 - [3] (1) = 13 - [4] (1) = 4 - ", b.toString());
		assertEquals(true, b.search(3));
		assertEquals(false, b.search(12));

	}

	
	@Test
	public void testHashTableRemoveLP(){
		// Example
		HashTable<Integer> a = new HashTable<Integer>(5, HashTable.LINEAR_PROBING, 1.0);
		a.add(4);
		a.add(13);
		a.add(24);
		a.add(3);
		a.remove(24);
		assertEquals(true, a.search(3));
		assertEquals(false, a.search(24));
		assertEquals("[0] (2) = 24 - [1] (1) = 3 - [2] (0) = null - [3] (1) = 13 - [4] (1) = 4 - ", a.toString());
				
		a.add(15);
		assertEquals(true, a.search(3));
		assertEquals("[0] (1) = 15 - [1] (1) = 3 - [2] (0) = null - [3] (1) = 13 - [4] (1) = 4 - ", a.toString());

	}
	
	
	@Test
	public void testHashTableRemoveQP(){
		// Example
		HashTable<Integer> b = new HashTable<Integer>(5, HashTable.QUADRATIC_PROBING, 1.0);
		b.add(4);
		b.add(13);
		b.add(24);
		b.add(3);
					
		b.remove(24);
		assertEquals(true, b.search(3));
		assertEquals("[0] (2) = 24 - [1] (0) = null - [2] (1) = 3 - [3] (1) = 13 - [4] (1) = 4 - ", b.toString());
					
		b.add(15);
		assertEquals(true, b.search(3));
		assertEquals("[0] (1) = 15 - [1] (0) = null - [2] (1) = 3 - [3] (1) = 13 - [4] (1) = 4 - ", b.toString());
	}
	
	
	@SuppressWarnings("static-access")
	@Test
	public void testPrime(){
		HashTable<Integer> a = new HashTable<Integer>(5, HashTable.LINEAR_PROBING, 1.0);
		assertEquals(false, a.isPrime(1)); // One is not a prime number so prime numbers are those grater than one that...
		assertEquals(true, a.isPrime(5));
		assertEquals(true, a.isPrime(17));
		assertEquals(true, a.isPrime(11));
		assertEquals(true, a.isPrime(113));
		assertEquals(false, a.isPrime(90));
		assertEquals(false, a.isPrime(12345));
		
		assertEquals(2, a.getPrevPrime(3));
		assertEquals(3, a.getPrevPrime(4));
		assertEquals(3, a.getPrevPrime(5));
		assertEquals(5, a.getPrevPrime(7));
		assertEquals(7, a.getPrevPrime(10));
		assertEquals(11, a.getPrevPrime(12));
		assertEquals(11, a.getPrevPrime(13));
		assertEquals(53, a.getPrevPrime(59));
		assertEquals(3499, a.getPrevPrime(3500));
		
	    assertEquals(7, a.getNextPrime(5));
		assertEquals(11, a.getNextPrime(7));
		assertEquals(11, a.getNextPrime(7));
		assertEquals(11, a.getNextPrime(7));
		assertEquals(13, a.getNextPrime(12));
		assertEquals(13, a.getNextPrime(11));
		assertEquals(17, a.getNextPrime(14));
		assertEquals(3001, a.getNextPrime(3000));
		
	}

}
