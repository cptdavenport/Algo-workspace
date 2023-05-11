/**
 * 
 */
package de.hska.iwi.ads.solution.search;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.search.Search;
import de.hska.iwi.ads.search.SearchTest;

/**
 * @author Davenport
 *
 */
class BinarySearchTest extends SearchTest {

	@Override
	public <E extends Comparable<E>> Search<E> createSearch() {
		return new BinarySearch<E>();
	}

	@Test
	void testSearchNonexistentElementInMiddleOfArray() {
		Search<Integer> search = createSearch();
		Integer[] array = { 1, 3, 5, 7, 9 };
		int result = search.search(array, 4);
		assertEquals(2, result);
	}

	@Test
	void testSearchNonexistentElementAtBeginningOfArray() {
		Search<Integer> search = createSearch();
		Integer[] array = { 1, 3, 5, 7, 9 };
		int result = search.search(array, 0);
		assertEquals(-1, result);
	}

	@Test
	void testSearchNonexistentElementAtEndOfArray() {
		Search<Integer> search = createSearch();
		Integer[] array = { 1, 3, 5, 7, 9 };
		int result = search.search(array, 10);
		assertEquals(5, result);
	}

	@Test
	void testSearchEmptyArray() {
		Search<Integer> search = createSearch();
		Integer[] array = {};
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> search.search(array, 2) );
	}

	@Test
	void testSearchSingleElementArray() {
		Search<Integer> search = createSearch();
		Integer[] array = { 4 };
		int result = search.search(array, 4);
		assertEquals(0, result);
	}

	@Test
	void testSearchRepeatedElements() {
		Search<Integer> search = createSearch();
		Integer[] array = { 1, 3, 3, 3, 3, 5, 7, 7, 9 };
		int result1 = search.search(array, 3);
		int result2 = search.search(array, 7);
		assertEquals(1, result1);
		assertEquals(6, result2);
	}

}