package test.sorting;

import main.sorting.GnomeSort;
import main.sorting.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class GnomeSortTest extends SortTest {

    @Test
    public void testSortInteger() {
        Sort gnome = new GnomeSort(getData());
        gnome.sort();
        List<Integer> act = gnome.getData().stream().collect(Collectors.toList());

        Assert.assertEquals(getExp(), act);
    }

}
