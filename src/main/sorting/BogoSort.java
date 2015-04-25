package main.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Bogo Sort - O(n . n!) - Random shuffle and check if sorted.
 */
public class BogoSort extends AbstractSort {

    public BogoSort(Collection<Integer> data) {
        super(data);
    }

    @Override
    public void sort() {
        ArrayList<Integer> arr = new ArrayList<>(getData());

        while (!isSorted(arr)) {
            Collections.shuffle(arr);
        }

        setData(arr);
    }

    private boolean isSorted(List<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i - 1) > arr.get(i)) {
                return false;
            }
        }

        return true;
    }

}
