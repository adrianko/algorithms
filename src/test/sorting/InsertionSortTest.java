package test.sorting;

import main.sorting.InsertionSort;
import main.sorting.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class InsertionSortTest extends SortTest {

    @Test
    public void testSortInteger() {
        Sort insertion = new InsertionSort(getData());
        insertion.sort();
        List<Integer> act = insertion.getData().stream().collect(Collectors.toList());

        Assert.assertEquals(getExp(), act);
    }
    
}
