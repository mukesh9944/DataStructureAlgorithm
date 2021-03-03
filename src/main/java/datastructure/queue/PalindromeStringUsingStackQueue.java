package datastructure.queue;

import java.util.LinkedList;


public class PalindromeStringUsingStackQueue {

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("aba"));

        System.out.println(checkForPalindrome("I did, did I?"));

        System.out.println(checkForPalindrome("Don't nod"));

        System.out.println(checkForPalindrome("hello"));
    }

    private static boolean checkForPalindrome(String str) {
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();

        str = str.toLowerCase();

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                stack.push(ch);
                queue.addLast(ch);
            }
        }

        while (!stack.isEmpty()){
            if(!stack.pop().equals(queue.removeFirst())){
                return false;
            }
        }

        return true;
    }
}
