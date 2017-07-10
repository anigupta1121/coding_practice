package beginning;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 7/2/2017.
 */
public class FullCountingSort {
    public static void main(String args[]){
        Scanner p=new Scanner(System.in);
        int n=p.nextInt();
        int num[]=new int[n];
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            num[i]=p.nextInt();
            if(i<=(n/2)-1) {
                str[i] = "-";
                p.next();
            }
            else
            str[i]=p.next();
        }

        sort(num,str);
    }

     private static void sort(int num[],String str[]){
        int n=num.length;
        int num2[]=new int[n];
        String s[]=new String[n];
        int count[] =new int[100];
         for (int aNum : num) {
             count[aNum]++;
         }
        for(int i=1;i<100;i++)
            count[i]+=count[i-1];

         for(int i=0;i<n;i++){
             int x=count[num[i]]-1;
             num2[x]=num[i];
             s[x]=str[i];
             --count[num[i]];
         }

         for(int i=0;i<n;i++){
             System.out.print(s[i]+" ");
         }

    }
}
