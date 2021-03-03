package algorithm.array;

/**
 * Given two strings str and ptr, the task is to find the smallest substring
 * in str containing all characters of ptr efficiently
 */
public class FindSmallestSubStringWindow {

    public static void main(String[] args) {
        String str = "ADOBECODEBANC";
        String ptr = "ABC";

        int[] ascii_str = new int[256];
        int[] ascii_ptr = new int[256];

        int str_len = str.length();
        int ptr_len = ptr.length();
        for (int i = 0; i < ptr_len; i++) {
            ascii_ptr[ptr.charAt(i)]++;
        }

        int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;
        int count = 0;
        for (int j = 0; j < str_len; j++) {

            ascii_str[str.charAt(j)]++;

            if(ascii_ptr[str.charAt(j)] != 0 &&
            ascii_str[str.charAt(j)] <= ascii_ptr[str.charAt(j)]){
                count++;
            }
            if(count == ptr_len)
            {
                while (ascii_str[str.charAt(start)] > ascii_ptr[str.charAt(start)]
                        || ascii_ptr[str.charAt(start)] == 0){
                    if(ascii_str[str.charAt(start)] > ascii_ptr[str.charAt(start)]){
                        ascii_str[str.charAt(start)]--;
                    }
                    start++;
                }
                int len_window = j -start + 1;
                if(min_len > len_window){
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
        System.out.println(str.substring(start_index, start_index+ min_len));
    }
}
