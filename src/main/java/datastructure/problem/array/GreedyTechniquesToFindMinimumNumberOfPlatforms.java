package datastructure.problem.array;

public class GreedyTechniquesToFindMinimumNumberOfPlatforms {

    public static void main(String[] args) {
        double[] arrivals = {1.00, 1.40, 1.50, 2.00, 2.15, 4.00};
        double[] departures = {1.10, 3.00, 2.20, 2.30, 3.15, 6.00};

        int i = 0, j = 0;
        int platform_needed = 0;
        int maxPlatforms = 0;

        while (i < arrivals.length && j < departures.length) {
            if (arrivals[i] < departures[j]) {
                platform_needed++;
                i++;
                if (platform_needed > maxPlatforms) {
                    maxPlatforms = platform_needed;
                }
            } else {
                platform_needed--;
                j++;
            }
        }
        System.out.println("Max number of platforms required : "+maxPlatforms);
    }
}
