package beginning;

import java.util.*;

public class ChefAndPickDigit {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int t = p.nextInt();

        while (t > 0) {
            String n = p.next();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i <= 9; i++) {
                map.put(i, 0);
            }
            for (char x : n.toCharArray()) {
                int y = x - 48;
                map.put(y, map.get(y) + 1);
            }

            printAlphabet(map);
            System.out.println();
            t--;
        }
    }

    private static void printAlphabet(HashMap<Integer, Integer> map) {
        for (int i = 0; i <= 9; i++) {

            if (map.get(i) != 0) {

                map.put(i, map.get(i) - 1);

                for (int j = 0; j <= 9; j++) {
                    if (map.get(j) != 0) {
                        int x = i * 10 + j;
                        if (x >= 65 && x <= 90) {
                            System.out.print((char) x);
                        }
                    }
                }

                map.put(i, map.get(i) + 1);
            }
        }
    }
}
