package de.hska.iwi.ads.solution.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.sorting.Reverse;

class ReverseArrayTest {

    @Test
    void testReverseIntegerArray() {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Reverse<Integer> reverseIntArray = new ReverseArray<>();
        reverseIntArray.reverse(intArray, 0, 4);
        assertArrayEquals(new Integer[] { 5, 4, 3, 2, 1 }, intArray);
    }

    @Test
    void testReverseStringArray() {
        String[] stringArray = { "hello", "world", "!" };
        Reverse<String> reverseStringArray = new ReverseArray<>();
        reverseStringArray.reverse(stringArray, 0, 2);
        assertArrayEquals(new String[] { "!", "world", "hello" }, stringArray);
    }

    @Test
    void testReverseDoubleArray() {
        Double[] doubleArray = { 1.0, 2.0, 3.0, 5.0, 4.0 };
        Reverse<Double> reverseDoubleArray = new ReverseArray<>();
        reverseDoubleArray.reverse(doubleArray, 1, 3);
        assertArrayEquals(new Double[] { 1.0, 5.0, 3.0, 2.0, 4.0 }, doubleArray);
    }

    @Test
    void testReverseSingleElementArray() {
        Integer[] singleIntArray = { 42 };
        Reverse<Integer> reverseSingleIntArray = new ReverseArray<>();
        reverseSingleIntArray.reverse(singleIntArray, 0, 0);
        assertArrayEquals(new Integer[] { 42 }, singleIntArray);
    }

    @Test
    void testReverseEmptyArray() {
        Integer[] emptyIntArray = {};
        Reverse<Integer> reverseEmptyIntArray = new ReverseArray<>();
        reverseEmptyIntArray.reverse(emptyIntArray, 0, -1);
        assertArrayEquals(new Integer[] {}, emptyIntArray);
    }
    
    @Test
    void testReversePartOfArray() {
    	Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7};
    	Reverse<Integer> reversePartOfArray = new ReverseArray<>();
    	reversePartOfArray.reverse(intArray, 1, 5);
    	Integer[] expected = {1, 6, 5, 4, 3, 2, 7};
    	assertArrayEquals(expected, intArray);
    }

}
