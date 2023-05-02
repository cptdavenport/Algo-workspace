package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.AbstractMergesort;
import de.hska.iwi.ads.sorting.Sort;

public class ReverseMergesort<E extends Comparable<E>> extends AbstractMergesort<E> implements Sort<E> {

  private final ReverseArray<E> reverser;

  public ReverseMergesort(ReverseArray<E> reverser) {
    this.reverser = reverser;
  }

  @Override
  protected void mergesort(E[] a, int left, int right) {
    if (left < right) {
      int middle = (left + right) / 2;
      mergesort(a, left, middle);
      mergesort(a, middle + 1, right);

      // Reverse the right subarray
      reverser.reverse(a, middle + 1, right);

      // Merge the two sorted subarrays
      verschmelzen(a, left, middle, right);
    }
  }

  private void verschmelzen(E[] a, int left, int middle, int right) {
    int l = left;
    int r = right;
    for (int i = left; i <= right; i++) {
      if (r < middle + 1 || (l <= middle && a[l].compareTo(a[r]) >= 0)) {
        b[i] = a[l];
        l++;
      } else {
        b[i] = a[r];
        r--;
      }
    }
    for (int i = left; i <= right; i++) {
      a[i] = b[i];
    }
  }
}
