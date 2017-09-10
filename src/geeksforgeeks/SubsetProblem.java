package geeksforgeeks;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/26/2017.
 */
public class SubsetProblem {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        while (t > 0) {
            int n = p.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = p.nextInt();
            }
            if(recurPartition(a, n)){
                System.out.println("YES");
            }else
                System.out.println("NO");

            t--;
        }
    }

    //DP Solution





    //My solution(wrong)
    private static void partition(int a[], int n) {
        Arrays.sort(a);
        int b[] = new int[n];
        b[0] = a[n - 1];
        for (int i = 1; i < n; i++) {
            b[i] = a[n - i - 1] + b[i - 1];
        }
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += a[i];
            if (sum == b[n - i - 2]) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");

    }





    private static boolean recurPartition(int a[], int n) {

        int sum = 0;
        for (int x : a) {
            sum += x;
        }
        if(sum%2!=0){
            return false;
        }


        return isSubsetSum(a,n,sum/2);
    }

    private static boolean isSubsetSum(int a[], int n, int sum){
        // Base Cases
        if (sum == 0)
            return true;
        if (n == 0 && sum != 0)
            return false;

        // If last element is greater than sum, then ignore it
        if (a[n-1] > sum)
            return isSubsetSum (a, n-1, sum);

        /* else, check if sum can be obtained by any of
           the following
        (a) including the last element
        (b) excluding the last element
        */
        return isSubsetSum (a, n-1, sum) ||
                isSubsetSum (a, n-1, sum-a[n-1]);


    }
}

    /*Following are
    the two main steps to solve this problem:

        1)Calculate sum of the array.If sum is odd,there can not be two subsets with equal sum,so return false.
        2)If sum of array elements is even,calculate sum/2and find a subset of array with sum equal to sum/2.

        The first step is simple.The second step is crucial,it can be solved either using recursion or Dynamic Programming.*/