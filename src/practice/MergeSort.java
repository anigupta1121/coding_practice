package practice;

import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 7/8/2017.
 */
public class MergeSort {
    public static void main(String[] args) {

        int a[]={5,4,9,8,7,14,3,1};
        mergeSort(a,0,a.length);
    }

    public static int[] mergeSort(int a[],int l,int r){

        int mid=(l+r)/2;
        mergeSort(a,l,mid);
        mergeSort(a,mid+1,r);
      //  a=merge(a,l,mid,r);
        return a;
    }

   /* private static int[] merge(int[] a, int l, int mid, int r) {
        int x[]=new int[mid-l];
        int y[]=new int[r-(mid+1)];
        for(int i=l;i<=mid;i++){
            x[i-l]=a[i];
        }
        for(int i=mid+1;i<=r;i++){
            y[i-(mid+1)]=a[i];
        }

    }*/

}
