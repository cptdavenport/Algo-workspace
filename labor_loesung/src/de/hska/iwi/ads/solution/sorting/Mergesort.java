package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.AbstractMergesort;
import de.hska.iwi.ads.sorting.Sort;

public class Mergesort<E extends Comparable<E>> implements Sort<E> {

	@Override
	public void sort(E[] a) {
		E[] b = (E[]) new Comparable[a.length];
		mergesort(a, b, 0, a.length - 1);
	}

	private void mergesort(E[] a, E[] b, int links, int rechts) {
		if (links < rechts) {
			int m = (links + rechts) / 2;
			mergesort(a, b, links, m);
			mergesort(a, b, m + 1, rechts);
			verschmelzen(a, b, links, m, rechts);
		}
	}

	private void verschmelzen(E[] a, E[] b, int links, int m, int rechts) {
		for (int i = links; i <= rechts; i++) {
			b[i] = a[i];
		}
		int i = links;
		int j = m + 1;
		int k = links;
		while (i <= m && j <= rechts) {
			if (b[i].compareTo(b[j]) <= 0) {
				a[k] = b[i];
				i++;
			} else {
				a[k] = b[j];
				j++;
			}
			k++;
		}
		while (i <= m) {
			a[k] = b[i];
			k++;
			i++;
		}
	}
}
