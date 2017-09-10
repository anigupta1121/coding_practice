package beginning;

/**
 * Created by guptaanirudh100 on 8/23/2017.
 */
public class EuclidGCD {
    public static void main(String[] args) {

        System.out.println(gcd(4, 16) );
        System.out.println(gcd(16, 4));
        System.out.println (gcd(15, 60));
        System.out.println (gcd(15, 65));
        System.out.println (gcd(52, 1052));
    }

    public static int gcd(int p,int q){
        if(q==0){
            return p;
        }
        return gcd(q,p%q);
    }
}
