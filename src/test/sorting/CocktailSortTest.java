package test.sorting;

import main.sorting.CocktailSort;
import main.sorting.Sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class CocktailSortTest extends SortTest {

    @Test
    public void testSortInteger() {
        Sort cocktail = new CocktailSort(getData());
        cocktail.sort();
        List<Integer> act = cocktail.getData().stream().collect(Collectors.toList());

        Assert.assertEquals(getExp(), act);
    }

}