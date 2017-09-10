package geeksforgeeks.strings;

import java.util.Scanner;

/**
 * Created by guptaanirudh100 on 8/27/2017.
 */
public class SumSubNumber {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        while (t > 0) {
            String n = p.next();
            sumDigits(n);
            t--;
        }

    }

    private static void sumDigits(String s) {
        int n = s.length();
        int sod[] = new int[n];

        sod[0] = toDigit(s.charAt(0));
        int sum = sod[0];
        for (int i = 1; i < n; i++) {

            int num = toDigit(s.charAt(i));
            sod[i] = (i + 1) * num + 10 * sod[i - 1];

            sum += sod[i];
        }

        System.out.println(sum);
    }

    private static int toDigit(char c) {
        return c - '0';
    }

//    http://www.geeksforgeeks.org/sum-of-all-substrings-of-a-string-representing-a-number/
}