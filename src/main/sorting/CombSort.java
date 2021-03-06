package main.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Comb Sort - O(n log n) - An exchange sort similar to bubble sort but differs where the gap between elements starts 
 * off very large and gets smaller with every pass. 
 */
public class CombSort extends AbstractSort {
    
    public CombSort(Collection<Integer> data) {
        super(data);
    }
    
    @Override
    public void sort() {
        ArrayList<Integer> arr = new ArrayList<>(getData());
        int gap = arr.size();
        boolean swapped = true;
        
        while (gap > 1 || swapped) {
            if (gap > 1) {
                gap = (int) (gap / 1.3);
            }
            
            swapped = false;
            
            for (int i = 0; (i + gap) < arr.size(); i++) {
                if (arr.get(i).compareTo(arr.get(i + gap)) > 0) {
                    Collections.swap(arr, i + gap, i);
                    swapped = true;
                }
            }
        }
        
        setData(arr);
    }
    
}
