package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/16/2017.
 */
public class Permutations {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        String s=p.next();
        System.out.println(Arrays.toString(permutations(s)));
    }

    public static StringBuilder[] permutations(String s) {
        if (s.length() == 0)
            return null;
        int length = fact(s.length());
        StringBuilder[] sb = new StringBuilder[length];
        for (int i = 0; i < length; i++) {
            sb[i] = new StringBuilder();
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int times = length / (i + 1);
            for (int j = 0; j < times; j++) {
                for (int k = 0; k < length / times; k++) {
                    sb[j * length / times + k].insert(k, ch);
                }
            }
        }
        return sb;
    }

    public static int fact(int n) {

        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }
}
