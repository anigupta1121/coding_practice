package spoj;

import practice.graph.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/22/2017.
 */
public class PPath {
    public static void main(String[] args) {

        Scanner p=new Scanner(System.in);
        
        int q=p.nextInt();
        while(q>0){
            int m=p.nextInt();
            int n=p.nextInt();
            int min=Integer.MAX_VALUE;

            ArrayList<Integer> primes=sieveOfEratosthenes(m,n);

            Map<Integer,Integer> map=new HashMap<>();



            q--;
        }
    }

    public static ArrayList<Integer> sieveOfEratosthenes(int m,int n)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        ArrayList<Integer> ans=new ArrayList<>();
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for(int i = m; i <= n; i++)
        {
            if(prime[i]&&i!=1)
                ans.add(i);
        }

        return ans;
    }
}
