package main.sorting;

import java.util.ArrayList;
import java.util.Collection;

public class BubbleSort {
    
    private Collection<Integer> data;
    
    public BubbleSort(Collection<Integer> data) {
        this.data = data;
    }
    
    public Collection<Integer> getData() {
        return data;
    }
    
    public void sort() {
        ArrayList<Integer> arr = new ArrayList<>(getData());
        int swap;
        
        for (int i = 0; i < (getData().size() - 1); i++) {
            for (int j = 0; j < getData().size() - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    swap = arr.get(j);
                    arr.add(j, arr.get(j + 1));
                    arr.remove(j + 1);
                    arr.add(j + 1, swap);
                    arr.remove(j + 2);
                }
            }
        }
        
        data = arr;
    }
    
}
