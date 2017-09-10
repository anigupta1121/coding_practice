package codevita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by guptaanirudh100 on 7/28/2017.
 */
public class BookFair {
    public static void main(String[] args) {
        FastReader p = new FastReader();
        String x[] = p.next().split(",");
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = Integer.parseInt(x[0]);
        int k = Integer.parseInt(x[1]);
        int inp[] = new int[n];
        for (int i = 0; i < n; i++) {
            inp[i] = p.nextInt();
        }
        int j;
        for (int i = 0; i < n; i++) {
            j = i;
            while (j < n) {
                if ((j + 1) < n && inp[j + 1] <= inp[j])
                    sum += inp[j];
                else if (j + 1 < n) {
                    sum += inp[j + 1];
                    j = j + 1;
                }
                j = j + k+1;
            }
            if (sum > max) {
                max = sum;

            }
            sum = 0;
        }
        System.out.println(max);
    }


//    public int solver()
}
