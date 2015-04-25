package test.sorting;

import main.sorting.BogoSort;
import main.sorting.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class BogoSortTest extends SortTest {

    @Test
    public void testSortInteger() {
        Sort bubble = new BogoSort(getData());
        bogo.sort();
        List<Integer> act = bogo.getData().stream().collect(Collectors.toList());

        Assert.assertEquals(getExp(), act);
    }

}