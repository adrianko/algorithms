package test.sorting;

import main.sorting.MergeSort;
import main.sorting.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MergeSortText {

    @Test
    public void testSortInteger() {
        List<Integer> data = new LinkedList<>(Arrays.asList(2, 6, 1, 5, 3, 9, 7));
        List<Integer> exp = new LinkedList<>(Arrays.asList(1, 2, 3, 5, 6, 7, 9));
        Sort merge = new MergeSort(data);
        merge.sort();
        List<Integer> act = merge.getData().stream().collect(Collectors.toList());

        Assert.assertEquals(exp, act);
    }

}
