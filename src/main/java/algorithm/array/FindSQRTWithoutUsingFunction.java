package algorithm.array;

public class FindSQRTWithoutUsingFunction {

    public static void main(String[] args) {
        double num = 9;

        double start = 1;
        double end = num;
        int i=1;
        while (true) {
            if(i*i == num){
                System.out.println(i);
                break;
            }else if(i*i > num) {
                double mid = (start + end) / 2;
                if (mid * mid == num || Math.abs(mid * mid - num) < 0.00001) {
                    System.out.printf("%.5f",mid);
                    break;
                }
                if (mid * mid > num) {
                    end = mid;
                }
                if (mid * mid < num) {
                    start = mid;
                }
            }
            i++;
        }
    }
}
