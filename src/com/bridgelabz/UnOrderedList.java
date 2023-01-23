package com.bridgelabz;

import java.util.Scanner;

public class UnOrderedList {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = paragraph.toLowerCase().split(" ");
        for (String word : words) {
            linkedList.append(word);
        }
        linkedList.display();
        System.out.println();
        System.out.println("Enter word you want to search: ");
        Scanner sc = new Scanner(System.in);

        String input =sc.next();
        if (linkedList.findNode(input) == input) {
            linkedList.delete(input);
        } else {
            linkedList.append(input);
        }
        linkedList.display();
    }
}
