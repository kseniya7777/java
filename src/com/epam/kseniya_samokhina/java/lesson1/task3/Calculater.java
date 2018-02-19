package com.epam.kseniya_samokhina.java.lesson1.task3;

import java.util.Scanner;

/**
 * Created by Kseniya on 11.02.2018.
 */
public class Calculater {
    public void startCalculater() {
        System.out.println("Enter number A");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        System.out.println("Enter number B");
        int B = sc.nextInt();

        System.out.println("Enter + for sum, - for dif, * for mult, / for div");
        String choice = sc.next();

        if (choice.equals("+"))
            task3_1(A, B);
        if (choice.equals("-"))
            task3_2(A, B);
        if (choice.equals("*"))
            task3_3(A, B);
        if (choice.equals("/"))
            task3_4(A, B);
    }
    /*calculating the sum*/
    public void task3_1(int a, int b) {
        int sum = a + b;
        System.out.println(+ a + "+" + b + "=" + sum);
    }
    /*calculating the difference*/
    public void task3_2(int a, int b) {
        int dif = a - b;
        System.out.println( a + "-" + b + "=" + dif);
    }
    /*calculating the multiplication*/
    public void task3_3(int a, int b) {
        int mult = a * b;
        System.out.println(a + "*" + b + "=" + mult);
    }
    /*calculating the division*/
    public void task3_4(int a, int b) {
        int div = a / b;
        System.out.println(a + "/" + b + "=" + div);
    }
}
