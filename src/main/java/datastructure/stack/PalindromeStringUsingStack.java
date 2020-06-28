package datastructure.stack;

import java.util.LinkedList;
import java.util.Stack;

public class PalindromeStringUsingStack {

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("aba"));

        System.out.println(checkForPalindrome("I did, did I?"));

        System.out.println(checkForPalindrome("Don't nod"));

        System.out.println(checkForPalindrome("hello"));
    }

    private static boolean checkForPalindrome(String str) {
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder builder = new StringBuilder(str.length());
        str = str.toLowerCase();

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                stack.push(ch);
                builder.append(ch);
            }
        }

        StringBuilder reverseString = new StringBuilder(stack.size());
        while (!stack.isEmpty()){
            reverseString.append(stack.pop());
        }

        return reverseString.toString().equals(builder.toString());
    }
}
