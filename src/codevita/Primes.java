package codevita;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by guptaanirudh100 on 7/28/2017.
 */
public class Primes {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n=p.nextInt();
        Set<Integer> set=new TreeSet<>();

            int count = 0;
            Primes obj = new Primes();
            for (int i = 2; i <= n; i++) {
                if (obj.isPrime(i))
                    for (int j = 2; j <= n; j++) {
                        if (obj.isPrime(j)) {
                            String x = String.valueOf(i) + String.valueOf(j);
                            if (obj.isPrime(Integer.parseInt(x))) {
                               set.add(Integer.parseInt(x));
                            }
                        }
                    }
            }
            System.out.println(set.size());


    }

    public boolean isPrime(int n) {

        if (n == 1)
            return false;
        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
