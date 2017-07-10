package practice;

import sun.rmi.runtime.Log;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QuickSort {


    static int partition(int[] ar, int low, int high) {
        int p=ar[low];
        int t;
        int i=high+1;
        for(int j=high;j>low;j--){
            if(ar[j]>=p){
                i--;
                t=ar[j];
                ar[j]=ar[i];
                ar[i]=t;

            }
        }
        t=ar[i-1];
        ar[i-1]=p;
        ar[low]=t;

        printArraypos(ar,low,i-2);
        printArraypos(ar,i,high);
        return(i-1);


    }


    static void printArray(int[] ar) {
        for (int n : ar) {

            System.out.print(n + " ");
        }

    }
    static void printArraypos(int arr[],int low,int high){

        if((high-low)>=1) {
            for (int i = low; i <=high; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        ar= quickSort(ar,0,ar.length-1);
         printArray(ar);
    }

    private static int[] quickSort(int[] ar,int low,int high) {

        if(low <high){
            int p= partition(ar,low,high);

            quickSort(ar,low,p-1);
            quickSort(ar,p+1,high);
        }
        return ar;
    }
}