package com.hillel.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Eugene Karpenko on 10.04.2015.
 */
public class Sort {

    private static final int ARRAY_LEN = 10;
    private static final int BOUND = 100;

    public static void main (String[] args) {
        Sort sort = new Sort();

        int[] array = sort.createRandomArray(ARRAY_LEN);

        System.out.println("Unsorted: " + Arrays.toString(array));

        long startTime = System.nanoTime();
        sort.insertionSort(array);
        long endTime = System.nanoTime();

        System.out.println("Sorted: " + Arrays.toString(array));
        System.out.println("Duration: " + (endTime - startTime));
    }

    /* Simple sorts */

    /*
        Stable
        O(1) extra space
        O(n2) comparisons and swaps
        Adaptive: O(n) time when nearly sorted
        Very low overhead
     */
    public void insertionSort(int[] array) {
        int i, j, temp;
        for (i = 1; i < ARRAY_LEN; i++) {
            j = i;
            temp = array[j];
            while ((j > 0) && (array[j - 1] > temp)) {
                // less efficient way is just swap j, j - 1 without temp
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
    }

    /*
       Not stable
       O(1) extra space
       ?(n2) comparisons
       ?(n) swaps
       Not adaptive
    */
    public void selectionSort(int[] array) {
        int minItemIndex;
        for (int i = 0; i < ARRAY_LEN; i++) {
            minItemIndex = getIndexOfMinElement(array, i);
            swap(array, i, minItemIndex);
        }
    }

    /* Efficient sorts */

    /*
        Stable
        ?(n) extra space for arrays (as shown)
        ?(lg(n)) extra space for linked lists
        ?(n·lg(n)) time
        Not adaptive
        Does not require random access to data
     */
    public void mergeSort(int[] array) {

    }

    private int[] createRandomArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(BOUND);
        }

        return array;
    }

    private int getIndexOfMinElement(int[] array, int startFrom) {
        int min = startFrom;
        for (int i = startFrom + 1; i < array.length; i++) {
            if (array[min] > array[i]) {
                min = i;
            }
        }

        return min;
    }

    private void swap(int[] array, int aIndex, int bIndex) {
        array[aIndex] = (array[aIndex] + array[bIndex]) - (array[bIndex] = array[aIndex]);
    }

    private void swap(Object[] array, int aIndex, int bIndex) {
        Object temp = array[aIndex];
        array[aIndex] = array[bIndex];
        array[bIndex] = temp;
    }
}
