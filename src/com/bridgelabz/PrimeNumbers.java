/*
Prime Number:
Is number that greater than 1 and divided by 1 or itself Only...
 */

package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int temp=0;
        System.out.println("Prime Numbers from range "+a+" To "+ b);

        for (int i=a;i<=b;i++) {
            if (i >= 2) {
                for (int n = 2; n < i; n++) {
                    if (i % n == 0)
                        temp = temp + 1;
                }
            }
                if (temp == 0) {
                    System.out.println( i + " ");
                } else {
                    temp =0;
            }
        }
    }
}
