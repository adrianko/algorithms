package main.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Selection Sort - O(n^2) - Array is divided into nominal sorted and unsorted sublists. At every step, the algorithm 
 * finds the smallest element in the unsorted sublist and adds it to the end of the sorted sublist. When the unsorted 
 * sublist becomes empty, sorting is complete.
 */
public class SelectionSort extends AbstractSort {
    
    public SelectionSort(Collection<Integer> data) {
        super(data);
    }
    
    @Override
    public void sort() {
        ArrayList<Integer> arr = new ArrayList<>(getData());
        
        for (int i = 0; i < arr.size(); i++) {
            int index = i;
            
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(index)) {
                    index = j;
                }
            }
            
            Collections.swap(arr, index, i);
        }
        
        setData(arr);
    }
    
}