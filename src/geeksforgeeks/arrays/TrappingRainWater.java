package geeksforgeeks.arrays;

import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/25/2017.
 */

//http://www.geeksforgeeks.org/trapping-rain-water/
public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        while (t > 0) {
            int n = p.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = p.nextInt();
            }
            trapWater(a, n);
            t--;
        }
    }

    private static void trapWater(int a[], int n) {

        int sum = 0;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = a[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], a[i]);
        }

        right[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], a[i]);
        }

        for (int i = 0; i < n; i++) {
            sum += Math.min(left[i], right[i]) - a[i];
        }
        System.out.println(sum);
    }
}
//http://www.geeksforgeeks.org/trapping-rain-water/