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
		return new BinarySearch();
	}
	
	
}