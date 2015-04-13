package main.sorting;

import java.util.ArrayList;
import java.util.Collection;

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