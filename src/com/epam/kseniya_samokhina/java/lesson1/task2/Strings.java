package com.epam.kseniya_samokhina.java.lesson1.task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Strings {
    public void startStrings() {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        /*Ввод строк*/
        ArrayList<String> arr_strings = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr_strings.add(sc.next());
        }
        task2_1(arr_strings);
        task2_2(arr_strings);
        task2_3(arr_strings);
        task2_4(arr_strings);
        task2_5(arr_strings);
        task2_6(arr_strings);
    }
    /*Задание 1*/
    public void task2_1(ArrayList<String> arr_strings) {
        String min="";
        String max="";
        int minlength = 1000000000;
        int maxlength=0;
        for (int i = 0; i < arr_strings.size(); i++) {
            if(arr_strings.get(i).length()<minlength)
            {
                min=arr_strings.get(i);
                minlength=arr_strings.get(i).length();
            }
            if(arr_strings.get(i).length()>maxlength)
            {
                max=arr_strings.get(i);
                maxlength=arr_strings.get(i).length();
            }
        }
        System.out.println("Result 1: short string: "+min+" with length "+minlength+", long string: "+max+" with length "+maxlength);
    }
    /*Задание 2*/
    public void task2_2(ArrayList<String> arr_strings)
    {
        int sum_l=0;
        for (int i = 0; i < arr_strings.size(); i++) {
            sum_l+=arr_strings.get(i).length();
        }
        int av_l=sum_l/arr_strings.size();
        System.out.print("Result 2: ");
        for (int i = 0; i < arr_strings.size(); i++) {
            if(arr_strings.get(i).length()>av_l)
                System.out.print(arr_strings.get(i)+" - "+arr_strings.get(i).length()+"; ");
        }
    }
    /*Задание 3*/
    public void task2_3(ArrayList<String> arr_strings)
    {
        int sum_l=0;
        for (int i = 0; i < arr_strings.size(); i++) {
            sum_l+=arr_strings.get(i).length();
        }
        int av_l=sum_l/arr_strings.size();
        System.out.print("\nResult 3: ");
        for (int i = 0; i < arr_strings.size(); i++) {
            if(arr_strings.get(i).length()<av_l)
                System.out.print(arr_strings.get(i)+" - "+arr_strings.get(i).length()+"; ");
        }
    }
    /*Задание 4*/
    public void task2_4(ArrayList<String> arr_strings)
    {
        String word="";
        int min_difchar=10000;
        for (int i = 0; i <arr_strings.size() ; i++) {
            HashSet<Character> difchar = new HashSet<>();
            for (int j = 0; j < arr_strings.get(i).length(); j++) {
                difchar.add(arr_strings.get(i).charAt(j));
            }
                if(difchar.size()<min_difchar){
                    min_difchar=difchar.size();
                    word=arr_strings.get(i);
                }
        }
        System.out.println("\nResult 4: "+word);
    }
    /*Задание 5*/
    public void task2_5(ArrayList<String> arr_strings)
    {
        String word="";
        for (int i=arr_strings.size()-1; i >=0 ; i--) {
            HashSet<Character> difchar = new HashSet<>();
            for (int j = 0; j < arr_strings.get(i).length(); j++) {
                difchar.add(arr_strings.get(i).charAt(j));
            }
            if(difchar.size()==arr_strings.get(i).length()){
                word=arr_strings.get(i);
            }
        }
        System.out.println("Result 5: "+word);
    }
    /*Задание 6*/
    public void task2_6(ArrayList<String> arr_strings)
    {
        ArrayList<String> words_dig=new ArrayList<>();
        for (int i = 0; i <arr_strings.size() ; i++) {
            String word_dig="";
            for (int j = 0; j < arr_strings.get(i).length(); j++) {
               if(Character.isDigit(arr_strings.get(i).charAt(j)))
                   word_dig+=arr_strings.get(i).charAt(j);
            }
            if(arr_strings.get(i).length()==word_dig.length())
                words_dig.add(word_dig);
        }
        if(words_dig.size()>1)
            System.out.println("Result 6: "+words_dig.get(1));
        else System.out.println("Result 6: "+words_dig.get(0));
    }
}
