package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramAndPalindrome {

    public static void checkPrimeNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int count = 0;
        System.out.println("Prime Numbers from range " + a + " To " + b);

        for (int i = a; i <= b; i++) {
            if (i >= 2) {
                int flag = 1;
                for (int n = 2; n < i; n++) {
                    if (i % n == 0) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1) {
                    count++;
                    checkPalindrome(i);
                }

            }

        }
    }

    public static void checkPalindrome(int number) {
        int reverse = 0;
        int temp = number;
        while (number != 0) {
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }
        if (reverse == temp) {
            System.out.println(temp + " is prime and palindrome.. ");
        }
    }

    public static void main(String[] args) {
        checkPrimeNumber();
    }
}


