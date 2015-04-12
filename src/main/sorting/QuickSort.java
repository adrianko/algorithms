package main.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Quick Sort - O(n^2) - Select middle element of array as pivot. All elements which are smaller than the pivot are
 * placed in one array and all the elements which are larger are placed in another array. Sort both arrays by
 * recursively applying quick sort to them. Finally, combine arrays.
 */
public class QuickSort extends AbstractSort {

    private ArrayList<Integer> arr;

    public QuickSort(Collection<Integer> data) {
        super(data);
    }

    @Override
    public void sort() {
        arr = new ArrayList<>(getData());
        quicksort(0, arr.size() - 1);
        setData(arr);
    }

    private void quicksort(int low, int high) {
        int i = low;
        int j = high;

        int pivot = arr.get(low + (high - low) / 2);

        while (i <= j) {
            while (arr.get(i) < pivot) {
                i++;
            }

            while (arr.get(j) > pivot) {
                j--;
            }

            if (i <= j) {
                Collections.swap(arr, i, j);
                i++;
                j--;
            }
        }

        if (low < j) {
            quicksort(low, j);
        }

        if (i < high) {
            quicksort(i, high);
        }
    }

}