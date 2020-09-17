package com.babushkin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("out.txt", true);
        try (Scanner scanner = new Scanner(new FileInputStream("in1.txt"));
             Scanner scanner1 = new Scanner(new FileInputStream("in2.txt"))) {
            while (scanner.hasNext() || scanner1.hasNext()) {
                if (!scanner.hasNext()) {
                    writer.write(scanner1.nextInt());
                } else if (!scanner1.hasNext()) {
                    writer.write(scanner.nextInt());
                } else if (scanner.nextInt() < scanner1.nextInt()) {
                    writer.write(scanner.nextInt());
                } else
                    writer.write(scanner1.nextInt());
//                try {
//                    System.out.println(scanner.nextInt());
//                } catch (InputMismatchException e) {
//                    scanner.next();
//                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        MergeSort mergeSort = new MergeSort();
        int[] a = null;
        int[] a1 = {1, 15, 2, 23, 198};
        int[] b1 = {5, 6, 8, 33};
        System.out.println(Arrays.toString(mergeSort.mergeSort(a1, b1)));
    }
}
