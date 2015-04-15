package test.sorting;

import main.sorting.ShellSort;
import main.sorting.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class ShellSortTest extends SortTest {

    @Test
    public void testSortInteger() {
        Sort shell = new ShellSort(getData());
        shell.sort();
        List<Integer> act = shell.getData().stream().collect(Collectors.toList());

        Assert.assertEquals(getExp(), act);
    }

}
