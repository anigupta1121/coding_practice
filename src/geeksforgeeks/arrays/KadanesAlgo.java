package geeksforgeeks.arrays;

import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/14/2017.
 */
public class KadanesAlgo {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = p.nextInt();
        }

        KadanesAlgo kadanesAlgo = new KadanesAlgo();
        MaxSumSub sumSub = kadanesAlgo.kadanes(a, n);
        System.out.println("sum=" + sumSub.sum);
        System.out.println(sumSub.i + " - " + sumSub.j);
    }

    private MaxSumSub kadanes(int a[], int n) {

        int i;
        MaxSumSub max_curr = new MaxSumSub();
        max_curr.sum = a[0];
        max_curr.i = 0;
        max_curr.j = 0;


        MaxSumSub max = new MaxSumSub();
        max.sum = a[0];
        max.i = 0;
        max.j = 0;


        for (i = 1; i < n; i++) {
            if (max_curr.sum > 0) {
                max_curr.sum = a[i];
                max_curr.i = i;
                max_curr.j = i;
            } else {
                max_curr.sum += a[i];
                max_curr.j = i;

            }
            if (max_curr.sum <= max.sum) {
                max.sum = max_curr.sum;
                max.j = i;
                max.i=max_curr.i;
            }

        }
        return max;
    }

    public class MaxSumSub {
        int sum;
        int i;
        int j;
    }
}
