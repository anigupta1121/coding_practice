package beginning;

import java.util.Arrays;

/**
 * Created by guptaanirudh100 on 7/13/2017.
 */
public class IceCreamParlor {
    public static void main(String[] args) {
        FastReader p=new FastReader();
        int t=p.nextInt();
        while(t>0){
            int m=p.nextInt();
            int n=p.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=p.nextInt();
            }
            for(int i=0;i<n;i++){
                if(a[i]<m){
                  int x=  linearSearch(a,m-a[i],i);
                    if(x>=0){
                        System.out.println((i+1)+" "+(x+1));
                        break;
                    }
                }
            }


            t--;
        }

    }
    public static int linearSearch(int a[], int x,int j) {
       for(int i=0;i<a.length;i++){
           if(a[i]==x&&i!=j)
               return i;
       }

        return -1;
    }

}
