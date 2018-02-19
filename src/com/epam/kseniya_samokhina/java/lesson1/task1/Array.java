package com.epam.kseniya_samokhina.java.lesson1.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Array {
    public void startArray() {
        /*Generation of the source array*/
        ArrayList<Integer> arr = new ArrayList<>();
        int c = 0;
        while (c != 20) {
            arr.add((int) (Math.random() * 20 - 10));
            c++;
        }
        System.out.println("Source array: " + arr);

        task1_1(arr);
        task1_2(arr);
        task1_3(arr);
        task1_4(arr);
        task1_5(arr);
        task1_6(arr);
    }
    /*Task 1_1*/
    public static void task1_1 (ArrayList<Integer> arr)
    {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.addAll(arr);
        int max = -10;
        int pos1 = 0;
        int pos2 = 0;
        int min = 10;
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) < 0 && arr1.get(i) > max) {
                max = arr1.get(i);
                pos1 = i;
            }
            if (arr1.get(i) > 0 && arr1.get(i) < min) {
                min = arr1.get(i);
                pos2 = i;
            }
        }
        Collections.swap(arr1, pos1, pos2);
        System.out.println("Result 1: " + arr1);
    }
    /*Task 1_2*/
    public static void task1_2 (ArrayList<Integer> arr)
    {
        int sum_of_elements = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 == 0)
                sum_of_elements += arr.get(i);
        }
        System.out.println("Result 2: " + sum_of_elements);
    }
    /*Task 1_3*/
    public static void task1_3 (ArrayList<Integer> arr)
    {
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.addAll(arr);
        for (int i = 0; i < arr3.size(); i++) {
            if (arr3.get(i) < 0)
                arr3.set(i, 0);
        }
        System.out.println("Result 3: " + arr3);
    }
    /*Task 1_4*/
    public static void task1_4 (ArrayList<Integer> arr)
    {
        ArrayList<Integer> arr4 = new ArrayList<>();
        arr4.addAll(arr);
        for (int i = 0; i + 1 < arr4.size(); i++) {
            if (arr4.get(i) > 0 && arr4.get(i + 1) < 0)
                arr4.set(i, 3 * arr4.get(i));
        }
        System.out.println("Result 4: " + arr4);
    }
    /*Task 1_5*/
    public static void task1_5 (ArrayList<Integer> arr)
    {
        int sumall = 0;
        for (int i = 0; i < arr.size(); i++) {
            sumall += arr.get(i);
        }
        int medium = sumall / arr.size();
        int min_elem = Collections.min(arr);
        System.out.println("Result 5: " + Math.abs(medium - min_elem));
    }
    /*Task 1_6*/
    public static void task1_6 (ArrayList<Integer> arr)
    {
        HashMap<Integer, Integer> p = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            if (p.containsKey(arr.get(i))) {
                p.put(arr.get(i), p.get(arr.get(i)) + 1);
            } else
                p.put(arr.get(i), 1);
        }
        System.out.print("Result 6: ");
        for (HashMap.Entry entry : p.entrySet()) {
            if (!entry.getValue().equals(1))
                for (int i = 0; i < arr.size(); i++) {
                    if (arr.get(i) == entry.getKey() && i % 2 == 1)
                        System.out.print(arr.get(i) + ", ");
                }
        }
    }
}
