package test.sorting;

import main.sorting.QuickSort;
import main.sorting.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class QuickSortTest {

    @Test
    public void testSortInteger() {
        List<Integer> data = new LinkedList<>(Arrays.asList(2, 6, 1, 5, 3, 9, 7));
        List<Integer> exp = new LinkedList<>(data);
        Collections.sort(exp);

        Sort quick = new QuickSort(data);
        quick.sort();
        List<Integer> act = quick.getData().stream().collect(Collectors.toList());

        Assert.assertEquals(exp, act);
    }

}
