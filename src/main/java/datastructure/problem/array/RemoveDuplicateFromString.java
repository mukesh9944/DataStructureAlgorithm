package datastructure.problem.array;

import java.util.Arrays;

public class RemoveDuplicateFromString {

    public static void main(String[] args) {

        String str= "abdeebaaaaaaaaabbbbbbbbbbbrrrrrrrrr";

        int[] assci = new int[255];
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if(assci[chars[i]] == 0){
                assci[chars[i]] = -1;
            } else if(assci[chars[i]] == -1){
                chars[i] = '\0';
            }
        }

        System.out.println(String.valueOf(chars).replaceAll("\0",""));
    }
}
