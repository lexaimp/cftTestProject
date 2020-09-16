package com.babushkin;

public class MergeSort {

    public int[] mergeSort(int[] array1, int[] array2) {
        int[] resultingArray = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int currentElement;

        for (int k = 0; k < resultingArray.length; k++) {
            if (i > array1.length - 1) {
                resultingArray[k] = array2[j];
                j++;
            } else if (j > array2.length - 1) {
                resultingArray[k] = array1[i];
                i++;
            } else if (array1[i] < array2[j]) {
                if (resultingArray[k] < array1[j]) {
                    resultingArray[k] = array1[i];
                }
                i++;
            } else {
                resultingArray[k] = array2[j];
                j++;
            }
        }
        return resultingArray;
    }
}
