package main.sorting;

import java.util.ArrayList;
import java.util.Collection;

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
        }
    }
    
}
