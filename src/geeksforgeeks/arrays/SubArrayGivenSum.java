package geeksforgeeks.arrays;

import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/14/2017.
 */
public class SubArrayGivenSum {


    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        while (t > 0) {
            int n = p.nextInt();
            int s = p.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = p.nextInt();
            }
            SubArrayGivenSum givenSum = new SubArrayGivenSum();
            int ans[] = givenSum.maxSum(a, n, s);
            System.out.println(ans[0] + " " + ans[1]);
            t--;
        }

    }

     /*Keep on adding elements in current_sum till its less than the given sum.
    If it becomes greater than given sum, start subtracting elements from the start of the array till its greater than given sum.*/

    public int[] maxSum(int a[], int n, int sum) {

        int curr_sum = a[0];
        int start = 0, end = 0;
        int ans[] = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        while (end < n) {
            if (curr_sum == sum) {
                ans[0] = start + 1;
                ans[1] = end + 1;
                return ans;
            }
            if (curr_sum < sum) {
                end++;
                if (end < n) {
                    curr_sum += a[end];
                }
            } else {

                curr_sum = curr_sum - a[start];
                start++;
            }
        }

        if (curr_sum == sum) {
            ans[0] = start + 1;
            ans[1] = end + 1;
            return ans;
        }
        return ans;
    }


}
