package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationOfString {

    public static void permutation( String string,String permutation) {
        if (string.length() == 0) {
            System.out.println(permutation);
        }
        for (int i=0;i < string.length();i++) {
            char newChar = string.charAt(i);
            String newString = string.substring(0,i) + string.substring(i+1);
            permutation(newString,permutation+newChar);
        }
    }

    public static void main(String[] args) {
        String string = "ABC";
        permutation(string," ");
    }
}
