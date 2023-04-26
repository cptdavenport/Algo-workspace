package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.AbstractMergesort;

public class ReverseMergesort<E extends Comparable<E>> extends AbstractMergesort<E> {

    @Override
    protected void mergesort(E[] a, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergesort(a, left, middle);
            mergesort(a, middle + 1, right);
            reverseMerge(a, left, middle, right);
        }
    }

    private void reverseMerge(E[] a, int left, int middle, int right) {
        int i, j, k;
        for (i = middle + 1; i > left; i--) {
            b[i - 1] = a[i - 1];
        }
        for (j = middle; j < right; j++) {
            b[right + middle - j] = a[j + 1];
        }
        for (k = left; k <= right; k++) {
            if (b[i].compareTo(b[j]) < 0) {
                a[k] = b[i++];
            } else {
                a[k] = b[j--];
            }
        }
    }
}
