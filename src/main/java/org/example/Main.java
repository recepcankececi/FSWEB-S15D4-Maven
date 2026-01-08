package org.example;

import java.util.Locale;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean checkForPalindrome(String str) {
        if (str == null) return false;
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ENGLISH);
        Stack<Character> stack = new Stack<>();
        
        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }
        
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        
        return cleaned.equals(reversed.toString());
    }

    public static String convertDecimalToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();
        if (decimal == 0) {
            return "0";
        }
        while (decimal > 0) {
            stack.push(decimal % 2);
            decimal = decimal / 2;
        }
        
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }
        
        return binary.toString();
    }
}
