package test.sorting;

import main.sorting.CycleSort;
import main.sorting.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class CycleSortTest extends SortTest {

    @Test
    public void testSortInteger() {
        Sort cycle = new CycleSort(getData());
        cycle.sort();
        List<Integer> act = cycle.getData().stream().collect(Collectors.toList());

        Assert.assertEquals(getExp(), act);
    }

}