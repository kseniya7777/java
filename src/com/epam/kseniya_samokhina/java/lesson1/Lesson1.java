package com.epam.kseniya_samokhina.java.lesson1;

import com.epam.kseniya_samokhina.java.lesson1.task1.Array;
import com.epam.kseniya_samokhina.java.lesson1.task2.Strings;
import com.epam.kseniya_samokhina.java.lesson1.task3.Calculater;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for task1, 2 for task2, 3 for task3");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                Array app = new Array();
                app.startArray();
                break;
            }
            case 2: {
                Strings app = new Strings();
                app.startStrings();
                break;
            }
            case 3: {
                Calculater app = new Calculater();
                app.startCalculater();
                break;
            }
        }
    }
}