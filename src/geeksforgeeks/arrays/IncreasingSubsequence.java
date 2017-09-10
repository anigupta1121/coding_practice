package geeksforgeeks.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/15/2017.
 */
public class IncreasingSubsequence {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        while (t > 0) {
            int n = p.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = p.nextInt();
            }
            findSequence(a, n);
            t--;
        }
    }

    private static void findSequence(int a[], int n) {
        int b[] = new int[n];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        //    int comingFrom[]=new int[n];
        /*for (int s=0;s<n;s++){
          comingFrom[s]=s;
        }*/

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i] && b[i] < a[i] + b[j]) {

                    b[i] = a[i] + b[j];
                }
            }
        }

        for (int x : b) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println(max);


    }
}
