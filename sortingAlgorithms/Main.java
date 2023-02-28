package sortingAlgorithms;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class Main {

    public static void main(String args[]) {
        int[] data = {8, 7, 2, 1, 0, 9, 6};
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data));

        int[] quicksortArray = copyOf(data, data.length);
        Quicksort.quickSort(quicksortArray, 0, data.length - 1);
        System.out.println("Quicksort: ");
        System.out.println(Arrays.toString(quicksortArray));

        int[] insertionSortArray = copyOf(data, data.length);
        InsertionSort.insertionSort(insertionSortArray);
        System.out.println("InsertionSort: ");
        System.out.println(Arrays.toString(insertionSortArray));

        int[] mergeSortArray = copyOf(data, data.length);
        MergeSort.mergeSort(mergeSortArray, 0, mergeSortArray.length - 1);
        System.out.println("MergeSort: ");
        System.out.println(Arrays.toString(mergeSortArray));
    }

}