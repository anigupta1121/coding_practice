package geeksforgeeks.arrays;

import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/15/2017.
 */
public class MinimumPlatforms {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        while (t > 0) {
            int n = p.nextInt();
            int arrival[] = new int[n];
            int departure[] = new int[n];
            for (int i = 0; i < n; i++) {
                arrival[i] = p.nextInt();
            }
            for (int i = 0; i < n; i++) {
                departure[i] = p.nextInt();
            }
            minPlatforms(arrival, departure, n);
            t--;
        }
    }

    /*Compare current element in arrival and departure array and pick smaller one among both.
    If element is pick up from arrival array then increment platform_needed.
    If element is pick up from departure array then decrement platform_needed.
    While performing above steps, we need track count of maximum value reached for platform_needed.
    In the end, we will return maximum value reached for platform_needed.*/

    private static void minPlatforms(int arrival[], int departure[], int n) {
        int platform_needed = 0;
        int max_platform = 0;
        int i = 0, j = 0;

        while (i < n && j < n) {
            if (arrival[i] < departure[j]) {
                platform_needed++;
                i++;
                if (platform_needed > max_platform) {
                    max_platform = platform_needed;
                }
            } else {
                platform_needed--;
                j++;
            }

        }
        if (max_platform > 0)
            System.out.println(max_platform);
        else
            System.out.println(max_platform + 1);

    }
}
