package geeksforgeeks.arrays;

import java.util.*;

/**
 * Created by guptaanirudh100 on 8/20/2017.
 */
public class RelativeSorting {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();
        while (t > 0) {
            int m = p.nextInt();
            int n = p.nextInt();
            int a[] = new int[m];
            int b[] = new int[n];
            for (int i = 0; i < m; i++) {
                a[i] = p.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = p.nextInt();
            }

            relativeSort(a, b, m, n);

            t--;
        }
    }

    private static void relativeSort(int a[], int b[], int m, int n){
        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int x = a[i];
            if (!map.containsKey(x))
                map.put(x, 1);
            else {
                map.put(x, map.get(x) + 1);
            }
        }


        for (int i = 0; i < n; i++) {
            if(map.containsKey(b[i])) {
                int count = map.get(b[i]);
                while (count > 0) {
                    ans.add(b[i]);

                    count--;
                }
                if (count == 0) {
                    map.remove(b[i]);
                }
            }
        }


        Set<Integer> sortedSet = map.keySet();
        Iterator<Integer> iterator = sortedSet.iterator();

        List<Integer> list = new ArrayList<>();
        while (iterator.hasNext()) {
            int key=iterator.next();
            int c=map.get(key);
            for (int i = 0; i < c; i++) {
                list.add(key);
            }

        }

        Collections.sort(list);
        for (int x : ans) {
            System.out.print(x + " ");
        }

        for (int x : list) System.out.print(x + " ");

        System.out.println();

    }
}
