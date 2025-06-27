package com.javarush.task.task01.task0105;

/* 
Объявляем переменные
*/

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            System.out.println("Triangle exists");
        } else {
            System.out.println("Triangle not exists");

        }
    }
}