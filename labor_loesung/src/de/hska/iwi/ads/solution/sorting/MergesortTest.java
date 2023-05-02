package de.hska.iwi.ads.solution.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.sorting.Sort;

public class MergesortTest {

  private Sort<Integer> sort;

  @BeforeEach
  public void setUp() {
    sort = new Mergesort<>();
  }

  @Test
  public void testEmptyArray() {
    Integer[] array = new Integer[0];
    sort.sort(array);
    assertTrue(array.length == 0);
  }

  @Test
  public void testAlreadySorted() {
    Integer[] array = {1, 2, 3, 4, 5};
    sort.sort(array);
    assertArrayEquals(new Integer[] {1, 2, 3, 4, 5}, array);
  }

  @Test
  public void testReverseOrder() {
    Integer[] array = {5, 4, 3, 2, 1};
    sort.sort(array);
    assertArrayEquals(new Integer[] {1, 2, 3, 4, 5}, array);
  }

  @Test
  public void testRandomOrder() {
    Integer[] array = {3, 5, 1, 4, 2};
    sort.sort(array);
    assertArrayEquals(new Integer[] {1, 2, 3, 4, 5}, array);
  }
}
