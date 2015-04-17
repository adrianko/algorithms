package main.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CocktailSort extends AbstractSort {
    
    public CocktailSort(Collection<Integer> data) {
        super(data);    
    }
    
    @Override
    public void sort() {
        ArrayList<Integer> arr = new ArrayList<>(getData());
        boolean swapped;
        
        do {
            swapped = false;
            
            for (int i = 0; i <= arr.size() - 2; i++) {
                if (arr.get(i) > arr.get(i + 1)) {
                    Collections.swap(arr, i, i + 1);
                    swapped = true;
                }
            }
            
            if (!swapped) {
                break;
            }
            
            swapped = false;
            
            for (int i = arr.size() - 2; i >= 0; i--) {
                if (arr.get(i) > arr.get(i + 1)) {
                    Collections.swap(arr, i, i + 1);
                    swapped = true;
                }
            }
        } while (swapped);
        
        setData(arr);
    }
    
}