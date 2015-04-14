package main.sorting;

import java.util.ArrayList;
import java.util.Collection;

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
            
            int smaller = arr.get(index);
            arr.set(index, arr.get(i));
            arr.set(i, smaller);
        }
        
        setData(arr);
    }
    
}