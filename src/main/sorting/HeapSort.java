package main.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HeapSort extends AbstractSort {
    
    public HeapSort(Collection<Integer> data) {
        super(data);    
    }
    
    @Override
    public void sort() {
        ArrayList<Integer> arr = new ArrayList<>(getData());
        int count = arr.size();
        heapify(arr, count);
        int end = count - 1;
        
        while (end > 0) {
            int temp = arr.get(end);
            arr.set(end, arr.get(0));
            arr.set(0, temp);
            siftDown(arr, 0, end - 1);
            end--;
        }
        
        setData(arr);
    }
    
    public void heapify(ArrayList<Integer> arr, int count) {
        int start = (count - 2) / 2;
        
        while (start >= 0) {
            siftDown(arr, start, count - 1);
            start--;
        }
    }
    
    public void siftDown(ArrayList<Integer> arr, int start, int end) {
        int root = start;
        
        while ((root * 2 + 1) <= end) {
            int child = root * 2 + 1;
            
            if ((child + 1) <= end && arr.get(child) < arr.get(child + 1)) {
                child++;
            }
            
            if (arr.get(root) < arr.get(child)) {
                Collections.swap(arr, root, child);
                root = child;
            } else {
                return;
            }
        }
    }
    
}
