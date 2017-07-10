package practice;

import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 7/2/2017.
 */
public class CountingSort {
    public static void main(String[] args) {
        int count[] =new int[100];
        Scanner p=new Scanner(System.in);
        int n= p.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
           a[i]=p.nextInt();
           count[a[i]]++;
        }
        for(int i=1;i<100;i++){
            count[i]+=count[i-1];
        }
        for(int i=0;i<n;i++){
            b[count[a[i]]-1]=a[i];
            --count[a[i]];
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }

    }
}
