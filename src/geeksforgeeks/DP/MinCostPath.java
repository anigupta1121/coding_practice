package geeksforgeeks.DP;

import java.util.ArrayList;

/**
 * Created by guptaanirudh100 on 8/23/2017.
 */
public class MinCostPath {

    public static void main(String[] args) {
        int cost[][]= {{1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}};

        System.out.println(minCost(cost,2,2));
    }

    public static int minCost(int cost[][], int m, int n) {
        int tc[][]=new int[m+1][n+1];

        tc[0][0]=cost[0][0];
        for(int i=1;i<=m;i++){
            tc[i][0]=tc[i-1][0]+cost[i][0];
        }

        for(int j=1;j<=n;j++){
            tc[0][j]=tc[0][j-1]+cost[0][j];
        }


        for(int i=1;i<=m;i++){
            for (int j = 1; j <= n; j++) {
                int min=min(tc[i-1][j-1],tc[i-1][j],tc[i][j-1]);
                tc[i][j]=cost[i][j]+min;
            }
        }

        return tc[m][n];
    }

    private static int min(int x, int y, int z)
    {
        if (x < y)
            return (x < z)? x : z;
        else
            return (y < z)? y : z;
    }
}
