package geeksforgeeks.arrays;

import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/15/2017.
 */
public class Sort012 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        while (t > 0) {
            int n = p.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = p.nextInt();

            }
            a = sort012(a, n);
            for (int x : a) {
                System.out.print(x + " ");
            }
            System.out.println();
            t--;
        }
    }


    //Dutch Normal Flag Problem
    private static int[] sort012(int a[], int n) {
        int lo = 0;
        int hi = n - 1;
        int mid = 0;
        int t;

        while (mid <= hi) {
            switch (a[mid]) {
                case 0:
                    t = a[mid];
                    a[mid] = a[lo];
                    a[lo] = t;
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    t = a[mid];
                    a[mid] = a[hi];
                    a[hi] = t;
                    hi--;

            }
        }
        return a;
    }

}
