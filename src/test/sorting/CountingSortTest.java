package test.sorting;

import main.sorting.CountingSort;
import main.sorting.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class CountingSortTest extends SortTest {

    @Test
    public void testSortInteger() {
        Sort counting = new CountingSort(getData());
        counting.sort();
        List<Integer> act = counting.getData().stream().collect(Collectors.toList());

        Assert.assertEquals(getExp(), act);
    }

}