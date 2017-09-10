package practice.graph;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.io.UncheckedIOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/22/2017.
 */
public class NumberOfIslands {
    public static void main(String[] args) {

        int m[][] = {{1, 1, 0, 0, 0},
                     {0, 1, 0, 0, 1},
                     {1, 0, 0, 1, 1},
                     {0, 0, 0, 0, 0},
                     {1, 0, 1, 1, 1}};


        int count=0;
        boolean visited[][]=new boolean[m.length][m.length];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if((!visited[i][j])&&m[i][j]==1){
                    bfs(visited,m,i,j);
                    count++;

                }
            }
        }
        System.out.println(count);

    }

    static void bfs(boolean visited[][],int m[][],int i,int j){
        visited[i][j]=true;
        if(i-1>=0&&(!visited[i-1][j])&&m[i-1][j]==1){
            bfs(visited,m,i-1,j);
        }
        if(j-1>=0&&(!visited[i][j-1])&&m[i][j-1]==1){
            bfs(visited,m,i,j-1);
        }
        if(i+1<m.length&&(!visited[i+1][j])&&m[i+1][j]==1){
            bfs(visited,m,i+1,j);
        }
        if(j+1<m.length&&(!visited[i][j+1])&&m[i][j+1]==1){
            bfs(visited,m,i,j+1);
        }


    }
}
