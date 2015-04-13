package test.sorting;

import main.sorting.MergeSort;
import main.sorting.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class MergeSortTest extends SortTest {

    @Test
    public void testSortInteger() {
        Sort merge = new MergeSort(getData());
        merge.sort();
        List<Integer> act = merge.getData().stream().collect(Collectors.toList());

        Assert.assertEquals(getExp(), act);
    }

}
