package test.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortTest {

    List<Integer> data = new LinkedList<>(Arrays.asList(2, 6, 1, 5, 3, 9, 7));
    
    public List<Integer> getExp() {
        List<Integer> exp = new LinkedList<>(data);
        Collections.sort(exp);
        
        return exp;
    }
    
    public List<Integer> getData() {
        return data;
    }
    
}
