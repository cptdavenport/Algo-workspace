package de.hska.iwi.ads.solution.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseMergesortTest {

    @Test
    public void testReverseMergesort() {
        Integer[] array = {5, 2, 7, 1, 9, 3};
        ReverseMergesort<Integer> reverseMergesort = new ReverseMergesort<Integer>(new ReverseArray<>());
        reverseMergesort.sort(array);
        Integer[] expected = {9, 7, 5, 3, 2, 1};
        Assertions.assertArrayEquals(expected, array);
    }
    
    @Test
    public void testReverseMergesortWithEmptyArray() {
      Integer[] a = {};
      ReverseMergesort<Integer> reverseMergesort = new ReverseMergesort<Integer>(new ReverseArray<>());
      reverseMergesort.sort(a);
      Assertions.assertArrayEquals(new Integer[] {}, a);
    }

    @Test
    public void testReverseMergesortWithSingleElementArray() {
      Integer[] a = {5};
      ReverseMergesort<Integer> reverseMergesort = new ReverseMergesort<Integer>(new ReverseArray<>());
      reverseMergesort.sort(a);
      Assertions.assertArrayEquals(new Integer[]{5}, a);
    }

    @Test
    public void testReverseMergesortWithAlreadySortedArray() {
      Integer[] a = {1, 2, 3, 4, 5, 6};
      ReverseMergesort<Integer> reverseMergesort = new ReverseMergesort<Integer>(new ReverseArray<>());
      reverseMergesort.sort(a);
      Assertions.assertArrayEquals(new Integer[]{6, 5, 4, 3, 2, 1}, a);
    }

}
