package test.sorting;

import main.sorting.HeapSort;
import main.sorting.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class HeapSortTest extends SortTest {

    @Test
    public void testSortInteger() {
        Sort heap = new HeapSort(getData());
        heap.sort();
        List<Integer> act = heap.getData().stream().collect(Collectors.toList());

        Assert.assertEquals(getExp(), act);
    }

}
