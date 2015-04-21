package test.sorting;

import main.sorting.PermutationSort;
import main.sorting.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class PermutationSortTest extends SortTest {

    @Test
    public void testSortInteger() {
        Sort permutation = new PermutationSort(getData());
        permutation.sort();
        List<Integer> act = permutation.getData().stream().collect(Collectors.toList());

        Assert.assertEquals(getExp(), act);
    }

}