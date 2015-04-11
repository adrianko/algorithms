package main.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Bubble Sort - O(n^2) - Compare a pair of elements at a time from the left to the right and swap if the left element
 * is larger than the right element. After every pass the next largest element will be in the correct position. Repeat 
 * until no swaps are made in a pass or until the total number of passes is equal to the number of elements.
 */
public class BubbleSort extends Sort {

    public BubbleSort(Collection<Integer> data) {
        super(data);
    }

    public void sort() {
        ArrayList<Integer> arr = new ArrayList<>(getData());
        
        for (int i = 0; i < (getData().size() - 1); i++) {
            for (int j = 0; j < (getData().size() - i - 1); j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    Collections.swap(arr, j, j + 1);
                }
            }
        }
        
        super.setData(arr);
    }
    
}
