package geeksforgeeks.arrays;


import java.util.*;


/**
 * Created by guptaanirudh100 on 8/20/2017.
 */
public class ZigZag {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        while (t > 0) {
            int n = p.nextInt();
            int a[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = p.nextInt();
            }

           zigZagArray(a,n);
            t--;
        }
    }

    private static void zigZagArray(int a[],int n){
        boolean flag=true;
        int t;

        for (int i = 0; i < a.length-1; i++) {
            if(flag){
                if(a[i]>a[i+1]){
                    t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            }else {
                if(a[i]<a[i+1]){
                    t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }

            }
            flag=!flag;
        }

        for (int x : a) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
