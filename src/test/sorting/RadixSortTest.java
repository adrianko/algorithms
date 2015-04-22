package test.sorting;

import main.sorting.RadixSort;
import main.sorting.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class RadixSortTest extends SortTest {

    @Test
    public void testSortInteger() {
        Sort radix = new RadixSort(getData());
        radix.sort();
        List<Integer> act = radix.getData().stream().collect(Collectors.toList());

        Assert.assertEquals(getExp(), act);
    }

}