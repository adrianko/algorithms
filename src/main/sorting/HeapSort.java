package main.sorting;

import java.util.ArrayList;
import java.util.Collection;

public class HeapSort extends AbstractSort {
    
    public HeapSort(Collection<Integer> data) {
        super(data);    
    }
    
    @Override
    public void sort() {
        ArrayList<Integer> arr = new ArrayList<>(getData());
    }
    
    public void heapify(ArrayList<Integer> arr, int count) {
        
    }
    
    public void siftDown(ArrayList<Integer> arr, int start, int end) {
        int root = start;
        
        while ((root * 2 + 1) <= end) {
            int child = root * 2 + 1;
            
            if ((child + 1) <= end && arr.get(child) < arr.get(child + 1)) {
                child++;
            }
            
            if (arr.get(root) < arr.get(child)) {
                int temp = arr.get(root);
                arr.set(root, arr.get(child));
                arr.set(child, temp);
                root = child;
            } else {
                return;
            }
        }
    }
    
}
