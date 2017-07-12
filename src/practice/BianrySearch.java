package practice;


import java.util.Arrays;

/**
 * Created by guptaanirudh100 on 7/11/2017.
 */
public class BianrySearch {
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int n = reader.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = reader.nextInt();
        }
        Arrays.sort(a);
        int x = reader.nextInt();
        int pos = new BianrySearch().binarySearch(a, x, 0, a.length - 1);
        if (pos != -1)
            System.out.println(pos);
        else
            System.out.println("Not found!");


    }

    public int binarySearch(int a[], int x, int low, int high) {


        while (high > low) {
            int mid = (low + high) / 2;
            if (a[mid] == x || mid == 0) {
                return mid;
            }
            if (a[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
