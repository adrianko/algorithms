package main.sorting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Insertion Sort - O(n^2) - Splits array into two sub-arrays. The first sub-array is always sorted and increases in
 * size as the sort continues. The second sub-array is unsorted, contains all the elements yet to be inserted into the
 * first sub-array, and decreases in size as the sort continues. With each pass through the loop, the next element in
 * the second sub-array is placed into its proper position in the first sorted sub-array.
 */
public class InsertionSort extends AbstractSort {
    
    public InsertionSort(Collection<Integer> data) {
        super(data);    
    }
    
    @Override
    public void sort() {
        ArrayList<Integer> arr = new ArrayList<>(getData());
        
        for (int i = 1; i < arr.size(); i++) {
            int temp = arr.get(i);
            int j;
            
            for (j = (i - 1); j >= 0 && temp < arr.get(j); j--) {
                arr.set(j + 1, arr.get(j));
            }
            
            arr.set(j + 1, temp);
        }
        
        super.setData(arr);
    }
    
}