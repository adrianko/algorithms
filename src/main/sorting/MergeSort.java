package main.sorting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Merge Sort - O(n log n) - Divide the unsorted list into n sublists, each containing 1 element. Repeatedly merge
 * ublists to produce new sorted sublists until there is only 1 list remaining.
 */
public class MergeSort extends AbstractSort {

    private ArrayList<Integer> arr;
    private ArrayList<Integer> helper;

    public MergeSort(Collection<Integer> data) {
        super(data);
    }

    @Override
    public void sort() {
        arr = new ArrayList<>(getData());
        helper = new ArrayList<>();
        mergesort(0, arr.size() - 1);
        data = arr;
    }

    private void mergesort(int low, int high) {
        if (low < high) {
            int middle = low + ((high - low) / 2);
            mergesort(low, middle);
            mergesort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            helper.add(i, arr.get(i));
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while (i <= middle && j <= high) {
            if (helper.get(i) <= helper.get(j)) {
                arr.set(k, helper.get(i));
                i++;
            } else {
                arr.set(k, helper.get(j));
                j++;
            }

            k++;
        }

        while (i <= middle) {
            arr.set(k, helper.get(i));
            k++;
            i++;
        }
    }

}
