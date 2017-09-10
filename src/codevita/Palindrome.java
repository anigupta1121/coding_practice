package codevita;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        ArrayList<String> set=new ArrayList<>();
        String n = p.next();
        int l = n.length();
        String x = n.substring(0, l / 2);
        String z;
        StringBuilder[] permutations=permutations(x);
        for (StringBuilder s :permutations) {

            if (l % 2 == 0) {
                z = "" +s+s.reverse();
                if(!set.contains(z))
                set.add(z);
            }else {
                z=""+s+n.charAt(l/2)+s.reverse();
                if(!set.contains(z))
                set.add(z);

            }
        }

        set.sort(String::compareTo);

        Iterator<String> iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

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
