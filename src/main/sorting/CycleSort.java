package main.sorting;

import java.util.ArrayList;
import java.util.Collection;

public class CycleSort extends AbstractSort {
    
    public CycleSort(Collection<Integer> data) {
        super(data);    
    }
    
    @Override
    public void sort() {
        ArrayList<Integer> arr = new ArrayList<>(getData());
        int writes = 0;
        
        for (int cycle = 0; cycle < arr.size() - 1; cycle++) {
            int val = arr.get(cycle);
            int pos = cycle;
            
            for (int i = cycle + 1; i < arr.size(); i++) {
                if (arr.get(i) < val) {
                    pos++;
                }
            }

            if (pos == cycle) {
                continue;
            }

            while (val == arr.get(pos)) {
                pos++;
            }

            int temp = arr.get(pos);
            arr.set(pos, val);
            val = temp;
            writes++;

            while (pos != cycle) {
                pos = cycle;

                for (int i = cycle + 1; i < arr.size(); i++) {
                    if (arr.get(i) < val) {
                        pos++;
                    }
                }
                
                while (val == arr.get(pos)) {
                    pos++;
                }

                temp = arr.get(pos);
                arr.set(pos, val);
                val = temp;
                writes++;
            }
        }
        
        setData(arr);
    }
    
}
