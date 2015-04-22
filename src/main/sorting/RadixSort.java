package main.sorting;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Radix Sort - O(nk) - A non comparative integer sorting algorithm that sorts data with integer keys by grouping keys 
 * by the individual digits which share the same significant position and value.
 */
public class RadixSort extends AbstractSort {
    
    public RadixSort(Collection<Integer> data) {
        super(data);    
    }
    
    @Override
    public void sort() {
        ArrayList<Integer> arl = new ArrayList<>(getData());
        int[] old = new int[arl.size()];

        for (int i = 0; i < arl.size(); i++) {
            old[i] = arl.get(i);
        }

        for (int shift = Integer.SIZE - 1; shift > -1; shift--) {
            int[] tmp = new int[old.length];
            int j = 0;

            for (int i = 0; i < old.length; i++) {
                boolean move = old[i] << shift >= 0;

                if (shift == 0 ? !move : move) {
                    tmp[j] = old[i];
                    j++;
                } else {
                    old[i - j] = old[i];
                }
            }
            
            System.arraycopy(old, 0, tmp, j, tmp.length - j);
            old = tmp;
        }

        arl.clear();

        for (int re : old) {
            arl.add(re);
        }
        
        setData(arl);
    }
    
}