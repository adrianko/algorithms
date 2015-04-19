package main.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Gnome Sort - O(n log n) - Similar to insertion sort except moving an element to its proper place is accomplished by 
 * a series of swaps, as in Bubble Sort.
 */
public class GnomeSort extends AbstractSort {
    
    public GnomeSort(Collection<Integer> data) {
        super(data);
    }
    
    @Override
    public void sort() {
        ArrayList<Integer> arr = new ArrayList<Integer>(getData());
        
        int i = 1;
        int j = 2;
        
        while (i < arr.size()) {
            if (arr.get(i - 1) <= arr.get(i)) {
                i = j;
                j++;
            } else {
                Collections.swap(arr, i - 1, i--);
                i = (i == 0) ? j++ : i;
            }
        }
        
        setData(arr);
    }
    
}
