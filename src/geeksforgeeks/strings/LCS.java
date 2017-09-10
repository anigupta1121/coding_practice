package geeksforgeeks.strings;

import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/27/2017.
 */
public class LCS {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        String s1 = p.next();
        String s2 = p.next();

        int lcs[][] = lcs_length(s1.toCharArray(), s2.toCharArray());
        System.out.println(lcs[s1.length()][s2.length()]);

        lcs_sequence(lcs,s1.toCharArray(),s2.toCharArray());


    }

    private static int[][] lcs_length(char a[], char b[]) {
        int m = a.length;
        int n = b.length;
        int lcs[][] = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            lcs[i][0] = 0;
        }
        for (int i = 0; i <= n; i++) {
            lcs[0][i] = 0;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a[i - 1] == b[j - 1]) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                } else {
                    lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
                }
            }
        }

        return lcs;
    }

    private static void lcs_sequence(int lcs[][], char a[], char b[]) {
        int m = a.length;
        int n = b.length;

        StringBuilder builder=new StringBuilder();
        int i=m,j=n;

        while(i>0&&j>0) {
            if (lcs[i][j] != Math.max(lcs[i - 1][j], lcs[i][j - 1])) {
                builder.append(a[i - 1]);
                i--;
                j--;
            }else{
                if(lcs[i][j-1]>lcs[i-1][j]){
                    j--;
                }else
                    i--;
            }
        }
        System.out.println(builder.reverse());
    }
}
