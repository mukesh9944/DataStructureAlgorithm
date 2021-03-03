package algorithm.array;

public class FindNextSmallestPalindromeNumber {

    public static void main(String[] args) {
        String num = "283929349";
        int length = num.length();
        String result = "";
        if (length % 2 == 0) {
            int mid = length / 2;
            if (num.charAt(mid - 1) > num.charAt(mid)) {
                String left = num.substring(0, length / 2);
                result = left + new StringBuilder(left).reverse().toString();
            } else if (num.charAt(mid - 1) <= num.charAt(mid)) {
                String left = num.substring(0, length / 2);
                left = String.valueOf(Integer.valueOf(left) + 1);
                result = left + new StringBuilder(left).reverse().toString();
            }
        } else {
            int mid = length / 2;
            if (num.charAt(mid - 1) > num.charAt(mid + 1)) {
                String left = num.substring(0, length / 2);
                String middle = num.substring(length / 2, length / 2 + 1);
                result = left + middle + new StringBuilder(left).reverse().toString();
            } else if (num.charAt(mid - 1) < num.charAt(mid + 1)) {
                String left = num.substring(0, length / 2);
                String middle = num.substring(length / 2, length / 2 + 1);
                middle = String.valueOf(Integer.valueOf(middle) + 1);
                result = left + middle + new StringBuilder(left).reverse().toString();
            } else {

            }
        }
        System.out.println(result);


    }
}
