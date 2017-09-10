package geeksforgeeks.arrays;

import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/15/2017.
 */
public class EquilibriumPoint {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        while (t > 0) {
            int n = p.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = p.nextInt();

            }
            int pos = equilibrium(a, n);
            System.out.println(pos);
            t--;
        }
    }

    /*1) Initialize leftsum  as 0
      2) Get the total sum of the array as sum
      3) Iterate through the array and for each index i, do following.
            a)  Update sum to get the right sum.
            sum = sum - arr[i]
            // sum is now right sum
            b) If leftsum is equal to sum, then return current index.
            c) leftsum = leftsum + arr[i] // update leftsum for next iteration.
      4) return -1 // If we come out of loop without returning then
    // there is no equilibrium index*/

    private static int equilibrium(int[] a, int n) {
        if(n==1)
        return 1;
        int sum=0,left_sum=0;
        for(int x:a){
            sum+=x;
        }
        for(int i=0;i<n;i++){
            sum=sum-a[i];

            if(sum==left_sum){
                return i+1;
            }

            left_sum+=a[i];
        }
        return -1;
    }
}
