package main.sorting;

import java.util.ArrayList;
import java.util.Collection;

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