package test.sorting;

import main.sorting.SelectionSort;
import main.sorting.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class SelectionSortTest extends SortTest {

    @Test
    public void testSortInteger() {
        Sort selection = new SelectionSort(getData());
        selection.sort();
        List<Integer> act = selection.getData().stream().collect(Collectors.toList());

        Assert.assertEquals(getExp(), act);
    }

}