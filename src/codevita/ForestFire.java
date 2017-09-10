package codevita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by guptaanirudh100 on 7/28/2017.
 */
public class ForestFire {
    public static  boolean flag=false;
    public static void main(String[] args) {
        FastReader p=new FastReader();
        int m=p.nextInt();
        int n=p.nextInt();
        int x=p.nextInt()-1;
        int y=p.nextInt()-1;
        String a[][]=new String[m][n];
       for(int i=0;i<m;i++){
           String s[]=p.nextLine().split(" ");
           for(int j=0;j<n;j++){
              a[i][j]=s[j];
           }
       }
       a[x][y]="1";
        int fire=2;
        a=burn(a,x,y,n,2);
    while(isLeft(a,m,n)) {
        fire++;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j].equals(String.valueOf(fire-1))) {
                    a = burn(a, i, j, n, fire);

                }
            }

        }

    }

        System.out.print(fire);


    }

    public static boolean isLeft(String a[][],int m,int n){

        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if(a[i][j].equals("T"))
                    return true;
            }
        }
            return false;
    }

    public static String[][] burn(String a[][],int x,int y,int n,int fire){


        //1
        if(x-1>0&&y-1>=0&& a[x-1][y-1].equals("T")){
            a[x-1][y-1]=String.valueOf(fire);
        }
        //9
        if(x+1<n&&y+1<n&& a[x+1][y+1].equals("T")){
            a[x+1][y+1]=String.valueOf(fire);
        }
        //2
        if(x-1>=0&&y<n&& a[x-1][y].equals("T")){
            a[x-1][y]=String.valueOf(fire);
        }
        //3
        if(x-1>=0&&y+1<n&& a[x-1][y+1].equals("T")){
            a[x-1][y+1]=String.valueOf(fire);
        }
        //4
        if(x<n&&y-1>=0&& a[x][y-1].equals("T")){
            a[x][y-1]=String.valueOf(fire);
        }
        //6
        if(x<n&&y+1<n&& a[x][y+1].equals("T")){
            a[x][y+1]=String.valueOf(fire);
        }
        //7
        if(x+1<n&&y-1>=0&& a[x+1][y-1].equals("T")){
            a[x+1][y-1]=String.valueOf(fire);
        }
        //8
        if(x+1<n&& a[x+1][y].equals("T")){
            a[x+1][y]=String.valueOf(fire);
        }



        return a;

    }



}



