package main.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Counting Sort - O(n + k) - Based on keys between a specific range. Works by counting the number of objects having 
 * distinct key values. Then doing some arithmetic to calculate the position of each object in the output sequence.
 */
public class CountingSort extends AbstractSort {
    
    public CountingSort(Collection<Integer> data) {
        super(data);
    }
    
    @Override
    public void sort() {
        ArrayList<Integer> arr = new ArrayList<>(getData());
        int max = Collections.max(arr);
        int min = Collections.min(arr);
        int[] count = new int[max - min + 1];
        
        for (int n : arr) {
            count[n - min]++;
        }
        
        int z = 0;
        
        for (int i = min; i <= max; i++) {
            while (count[i - min] > 0) {
                arr.set(z, i);
                z++;
                count[i - min]--;
            }
        }
        
        setData(arr);
    }
    
}
