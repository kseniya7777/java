package com.epam.kseniya_samokhina.java.lesson1;

import com.epam.kseniya_samokhina.java.lesson1.task1.Array;
import com.epam.kseniya_samokhina.java.lesson1.task2.Strings;
import com.epam.kseniya_samokhina.java.lesson1.task3.Calculator;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for task1, 2 for task2, 3 for task3");
        int choice = sc.nextInt();
        switch (choice) {
            /*task1*/
            case 1: {
                Array app = new Array();
                app.startArray();
                break;
            }
            /*task2*/
            case 2: {
                Strings app = new Strings();
                app.startStrings();
                break;
            }
            /*task3*/
            case 3: {
                Calculator app = new Calculator();
                app.startCalculator();
                break;
            }
        }
    }
}
