package test.sorting;

import main.sorting.QuickSort;
import main.sorting.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class QuickSortTest extends SortTest {

    @Test
    public void testSortInteger() {
        Sort quick = new QuickSort(getData());
        quick.sort();
        List<Integer> act = quick.getData().stream().collect(Collectors.toList());

        Assert.assertEquals(getExp(), act);
    }

}
