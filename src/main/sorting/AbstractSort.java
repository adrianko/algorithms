package main.sorting;

import java.util.Collection;

public abstract class AbstractSort implements Sort {

    protected Collection<Integer> data;

    public AbstractSort(Collection<Integer> data) {
        this.data = data;
    }

    public Collection<Integer> getData() {
        return data;
    }

    public void setData(Collection<Integer> data) {
        this.data = data;
    }

    public abstract void sort();

}