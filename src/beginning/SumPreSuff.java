package beginning;

import java.util.Scanner;

public class SumPreSuff {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();

        while (t > 0) {
            int n = p.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = p.nextInt();
            }
            minSum(a, n);
            t--;
        }
    }

    private static void minSum(int a[], int n) {
        int s1[] = new int[n];
        int s2[] = new int[n];

        s1[0]=a[0];
        s2[0]=a[n-1];
        int max = Integer.MIN_VALUE;
        int sum ;
        for (int i = 1; i < n; i++) {
            s1[i] += s1[i - 1]+a[i];
        }

        for (int i = 1; i <n; i++) {
            s2[i] += s2[i-1]+a[n-i-1];
        }

        for (int i = 0; i < n; i++) {
            sum = s1[i] + s2[n - i - 1];
            if (sum > max) {
                max=sum;
            }
        }
        System.out.println(max);

    }
}
