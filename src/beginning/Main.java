package beginning;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 7/7/2017.
 */
public class Main {

    public static void main(String args[]){
        Scanner p=new Scanner(System.in);

       long n=p.nextLong();
       long k=p.nextLong();
        BigInteger sum=new BigInteger("0");
        for(long i=0;i<=k;i+=2){
            sum=sum.add(com(n,i));
        }
        System.out.print(sum);
    }

    static BigInteger com(long n,long k){
        return factorial(n).divide(factorial(n-k).multiply(factorial(k)));
    }

    static BigInteger factorial(long N)
    {

        BigInteger f = new BigInteger("1");

        // Multiply f with 2, 3, ...N
        for (long i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }

}
