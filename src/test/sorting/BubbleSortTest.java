package test.sorting;

import main.sorting.BubbleSort;

import main.sorting.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class BubbleSortTest extends SortTest {
    
    @Test
    public void testSortInteger() {
        Sort bubble = new BubbleSort(getData());
        bubble.sort();
        List<Integer> act = bubble.getData().stream().collect(Collectors.toList());

        Assert.assertEquals(getExp(), act);
    }
    
}
