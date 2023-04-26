package de.hska.iwi.ads.solution.search;

import de.hska.iwi.ads.search.Search;

public class BinarySearch<E extends Comparable<E>> implements Search<E> {

	@Override
	public int search(Comparable[] a, Comparable key, int left, int right) {
		// Check for null input array
		if (a == null) {
			throw new NullPointerException("Input array is null");
		}

		// Check for invalid indices
		if (left < 0 || left >= a.length || right < 0 || right >= a.length || left > right) {
			throw new ArrayIndexOutOfBoundsException("Invalid left or right index");
		}

		int low = left;
		int high = right;
		int result = -1; // initialize result to -1

		while (low <= high) {
			int mid = (low + high) >>> 1; // calculate mid point
			Comparable midVal = a[mid];
			int cmp = midVal.compareTo(key);

			if (cmp < 0) {
				low = mid + 1;
			} else if (cmp > 0) {
				high = mid - 1;
			} else { // key found at index mid
				result = mid;
				high = mid - 1; // keep searching for lower index of key
			}
		}

		// key not found, check for other cases
		if (result == -1) {
			if (key.compareTo(a[left]) < 0) { // case 1
				result = left - 1;
			} else if (key.compareTo(a[right]) > 0) { // case 2
				result = right + 1;
			} else { // case 3
				for (int i = left; i <= right; i++) {
					if (key.compareTo(a[i]) < 0) {
						result = i;
						break;
					}
				}
			}
		}

		return result;
	}

}
