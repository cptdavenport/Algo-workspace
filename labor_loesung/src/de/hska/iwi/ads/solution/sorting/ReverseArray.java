package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.Reverse;

public class ReverseArray<E extends Comparable<E>> implements Reverse<E> {

	@Override
	public void reverse(E[] a, int from, int to) {
		if (a == null || from < 0 || from >= to || to >= a.length) {
			return; // do nothing for invalid arguments
		}
		int i = from;
		int j = to;
		while (i < j) {
			swap(a, i++, j--);
		}
	}

	private void swap(E[] a, int i, int j) {
		E tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
