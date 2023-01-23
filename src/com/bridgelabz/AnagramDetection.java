/*
Anagram Detection:
We can form one string by arranging the characters of another string...
Eg.Race And Care..
 */

package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String str1 = scanner.next();
        System.out.println("Enter second String: ");
        String str2 = scanner.next();

        if (str1.length() == str2.length()) {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams..");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams..");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams..");

        }
    }
}
