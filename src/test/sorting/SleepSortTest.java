package test.sorting;

import main.sorting.SleepSort;
import main.sorting.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class SleepSortTest extends SortTest {

    @Test
    public void testSortInteger() {
        Sort sleep = new SleepSort(getData());
        sleep.sort();
        List<Integer> act = sleep.getData().stream().collect(Collectors.toList());

        Assert.assertEquals(getExp(), act);
    }

}