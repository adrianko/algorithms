package main.sorting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Shell Sort - O(n log^2 n) - Generalisation of insertion sort that allows the exchange of items that are far apart.
 * The original list is broken into a smaller number of sublists, each of which is sorted using an insertion sort. The 
 * unique way that these sublists are chosen is the key to the shell sort. Instead of breaking the list into sublists of
 * contiguous items, the shell sort uses an increment 'i' called the gap to create a sublist be choosing items that are 
 * 'i' numbers apart.
 */
public class ShellSort extends AbstractSort {
    
    public ShellSort(Collection<Integer> data) {
        super(data);
    }
    
    @Override
    public void sort() {
        ArrayList<Integer> arr = new ArrayList<>(getData());
        int incr = arr.size() / 2;
        
        while (incr > 0) {
            for (int i = incr; i < arr.size(); i++) {
                int j = i;
                int temp = arr.get(i);
                
                while (j >= incr && arr.get(j - incr) > temp) {
                    arr.set(j, arr.get(j - incr));
                    j = j - incr;
                }
                
                arr.set(j, temp);
            }
            
            if (incr == 2) {
                incr = 1;
            } else {
                incr *= (5.0 / 11);
            }
        }
        
        setData(arr);
    }
    
}