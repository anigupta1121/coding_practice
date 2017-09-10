package geeksforgeeks.arrays;

import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/14/2017.
 */
public class MissingNumber {
    public static void main(String[] args) {

        Scanner p=new Scanner(System.in);
        int t=p.nextInt();
        while(t>0) {
            int n = p.nextInt();
            int sum=0;
            for(int i=0;i<n-1;i++){
             sum+=p.nextInt();
            }
            int expected=n*(n+1)/2;
            System.out.println(expected-sum);

            t--;
        }
    }

//Subtract the sum of the array from Nx(N+1)/2


}
