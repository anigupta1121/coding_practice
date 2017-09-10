package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by guptaanirudh100 on 7/8/2017.
 */
public class InsertionSort {


    /* mark first element as sorted
            for each unsorted element X
            'extract' the element X
            for j = lastSortedIndex down to 0
            if current element j > X
            move sorted element to the right by 1
            break loop and insert X here*/

    public static void main(String[] args) {
       FastReader p=new FastReader();

        int n=p.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=p.nextInt();
        }
        int res=insertSort(a);
        /*for (int x : a) {
            System.out.print(x+" ");
        }*/
        System.out.println(res);

    }

    public static int insertSort(int b[]){
        int n=b.length;
        int t=0,j;
        int c=0;
        for(int i=1;i<n;i++){
            int key=b[i];
            for( j=i-1;j>=0&&(key<b[j]);j--){
                   b[j+1]=b[j];
                   c++;
            }
            b[j+1]=key;

        }
        return c;
    }

    public static void insertionSortWhile(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;//position where a hole is created
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }


}
