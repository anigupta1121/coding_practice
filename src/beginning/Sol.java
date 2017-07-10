package beginning;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 7/8/2017.
 */
public class Sol {
    public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
        ArrayList<Integer> c=new ArrayList<>();

        int sum1=0;
        int sum2=Integer.MIN_VALUE;
        for(int x:a){
             sum1+=x;

            if(sum2<sum1){
                sum2=sum1;
                c.add(x);
            }else{

                sum1=0;
            }
        }

        return c;

    }

    public static void main(String args[]){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(5);
        a.add(-7);
        a.add(4);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(5);


        a=maxset(a);
        for(int x:a){
            System.out.print(x+" ");
        }
    }
}
