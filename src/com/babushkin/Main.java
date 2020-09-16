package com.babushkin;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] a = null;
        int[] a1 = {1, 15, 2, 23, 198};
        int[] b1 = {5, 6, 8, 33};
        System.out.println(Arrays.toString(mergeSort.mergeSort(a1, b1)));
    }
}
