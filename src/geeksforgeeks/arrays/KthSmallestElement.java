package geeksforgeeks.arrays;

import java.util.*;

/**
 * Created by guptaanirudh100 on 8/18/2017.
 */
public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        while (t > 0) {
            int n = p.nextInt();
            int a[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = p.nextInt();
            }
            int k = p.nextInt();
            KthSmallestElement smallestElement = new KthSmallestElement();
            System.out.println(smallestElement.kSmallest(a, 0, n - 1, k));

            t--;
        }
    }

    private int kSmallest(int[] a, int l, int h, int k) {
        if (k > 0 && k <= h - l + 1) {
            int pos = randomPartition(a, l, h);

            if (pos - 1 == k - 1) {
                return a[pos];
            }

            // If position is more, recur for left subarray
            if (pos - l > k - 1)
                return kSmallest(a, l, pos - 1, k);

            // Else recur for right subarray
            return kSmallest(a, pos + 1, h, k - pos + l - 1);

        }

        return -1;
    }

    private int partition(int a[], int l, int h) {
        int p = a[h];
        int i = l;
        for (int j = l; j < h - 1; j++) {
            if (a[j] <= p) {
                //swap a[i] and a[j]
                swap(a, i, j);
                i++;
            }
        }
        swap(a, i, h);
        return i;

    }

    private int randomPartition(int arr[], int l, int r) {
        int n = r - l + 1;
        int pivot = (int) (Math.random()) % n;
        swap(arr, l + pivot, r);
        return partition(arr, l, r);
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;


    }
}
