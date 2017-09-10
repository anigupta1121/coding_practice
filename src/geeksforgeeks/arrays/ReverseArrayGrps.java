package geeksforgeeks.arrays;

import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/18/2017.
 */
public class ReverseArrayGrps {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        while (t > 0) {
            int n = p.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = p.nextInt();
            }
            int k = p.nextInt();
            reverse(a, n, k);
            t--;
        }
    }

    private static void reverse(int a[], int n, int k) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count < k ) {
                builder.insert(0, a[i] + " ");
                count++;
            } else {
                System.out.print(builder);
                builder=new StringBuilder();
                builder.insert(0,a[i]+" ");
                count=1;
            }
        }

        if(count>=1){
            System.out.print(builder);
        }
        System.out.println();
    }

}
