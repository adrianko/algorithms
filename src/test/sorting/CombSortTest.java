package test.sorting;

import main.sorting.CombSort;
import main.sorting.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class CombSortTest extends SortTest {

    @Test
    public void testSortInteger() {
        Sort comb = new CombSort(getData());
        comb.sort();
        List<Integer> act = comb.getData().stream().collect(Collectors.toList());

        Assert.assertEquals(getExp(), act);
    }

}
