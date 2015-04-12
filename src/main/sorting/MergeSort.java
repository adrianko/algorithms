package main.sorting;

import java.util.ArrayList;
import java.util.Collection;

public class MergeSort extends AbstractSort {

    private ArrayList<Integer> arr;

    public MergeSort(Collection<Integer> data) {
        super(data);
    }

    @Override
    public void sort() {
        arr = new ArrayList<>(getData());
        mergesort(0, arr.size() - 1);
    }

    public void mergesort(int low, int high) {

    }

    public void merge(int low, int middle, int high) {

    }

}
