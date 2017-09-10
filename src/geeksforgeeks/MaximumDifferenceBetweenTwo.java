package geeksforgeeks;

import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/19/2017.
 */
public class MaximumDifferenceBetweenTwo {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        int n=p.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++){
            a[i]=p.nextInt();
        }
        int max_diff=a[0]-a[1];
        int min_element=a[0];

        for(int i=1;i<n;i++){
            if(a[i]-min_element>max_diff){
                max_diff=a[i]-min_element;
            }
            if(a[i]<min_element)
                min_element=a[i];
        }

        System.out.println(max_diff);
    }
}
