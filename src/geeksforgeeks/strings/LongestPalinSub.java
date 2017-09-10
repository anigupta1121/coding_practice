package geeksforgeeks.strings;

import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/27/2017.
 */
public class LongestPalinSub {
    static int count = 0;
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        while (t > 0) {
            String n = p.next();
            System.out.println(lps(n.toCharArray()));
            t--;
        }
    }


    static int lps(char []seq)
    {
        int n=seq.length;
       int lps[][]=new int[n+1][n+1];

       for(int i=0;i<=n;i++){
           lps[0][0]=1;
       }
       for(int i=2;i<=n;i++){
           for(int j=0;j<n-i+1;j++){

           }
       }
       return 0;
    }

    //DP Solution


}