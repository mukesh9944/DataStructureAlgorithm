package algorithm.array;

import java.util.Arrays;

public class MinimunNumberOfPlatform {
    public static void main(String[] args) {
        double[] arrivals = {1.00, 1.40, 1.50, 2.00, 2.15, 4.00};
        double[] departures = {1.10, 3.00, 2.20, 2.30, 3.15, 6.00};
        int n = arrivals.length;
        int platform_needed = 0;
        int maxPlatform = 0;
        Arrays.sort(departures);
        for (int i = 0, j = 0; i < n && j < n; ) {
            if (arrivals[i] < departures[j]) {
                platform_needed++;
                i++;
                if (platform_needed > maxPlatform) {
                    maxPlatform = platform_needed;
                }
            } else {
                platform_needed--;
                j++;
            }
        }

        System.out.println("Minimum number of platforms needed " + maxPlatform);
    }
}
