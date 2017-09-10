package geeksforgeeks.arrays;

import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/15/2017.
 */
public class Leaders {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        while (t > 0) {
            int n = p.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = p.nextInt();
            }
            leaders(a,n);
            t--;
        }
    }

    private static void leaders(int a[],int n){
        int max=Integer.MIN_VALUE;
        StringBuilder builder=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            if(a[i]>max){
                max=a[i];
                //System.out.print(max+" ");
                builder.insert(0,max+" ");
            }
        }
        System.out.println(builder);
    }
}
