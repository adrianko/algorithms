package main.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PermutationSort extends AbstractSort {

    public PermutationSort(Collection<Integer> data) {
        super(data);
    }

    @Override
    public void sort() {
        ArrayList<Integer> arl = new ArrayList<>(getData());
        int[] arr = new int[arl.size()];

        for (int i = 0; i < arl.size(); i++) {
            arr[i] = arl.get(i);
        }

        arl.clear();

        for (int re : pSort(arr)) {
            arl.add(re);
        }

        setData(arl);
    }

    public static int[] pSort(int[] a) {
        List<int[]> list=new ArrayList<>();
        permute(a,a.length,list);

        for(int[] x : list) {
            if (isSorted(x)) {
                return x;
            }
        }

        return a;
    }

    private static void permute(int[] a, int n, List<int[]> list) {
        if (n == 1) {
            int[] b = new int[a.length];
            System.arraycopy(a, 0, b, 0, a.length);
            list.add(b);

            return;
        }

        for (int i = 0; i < n; i++) {
            swap(a, i, n - 1);
            permute(a, n-1, list);
            swap(a, i, n-1);
        }
    }

    private static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                return false;
            }
        }
        return true;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}