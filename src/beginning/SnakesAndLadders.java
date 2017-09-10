package beginning;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guptaanirudh100 on 8/6/2017.
 */
public class SnakesAndLadders {

    public static void main(String[] args) {
        Map<Integer, Integer> ladders = new HashMap<>();
        Map<Integer, Integer> snakes = new HashMap<>();

        FastReader p = new FastReader();
        int t = p.nextInt();
        while (t > 0) {
            int m = p.nextInt();
            for (int i = 0; i < m; i++) {
                ladders.put(p.nextInt(), p.nextInt());
            }
            int n = p.nextInt();
            for (int i = 0; i < n; i++) {
                snakes.put(p.nextInt(), p.nextInt());
            }
            int move = 1;
            int count = 0;

            while (move != 100) {
                int max = -1;
                if (ladders.containsKey(move)) {
                    move = ladders.get(move);

                } else {
                    for (int i = 6; i > 0; i--) {
                        int x = move + i;
                        if (ladders.containsKey(x)) {
                            move = move + i;
                            count++;
                            max = -1;
                            break;
                        }
                        if (!snakes.containsKey(x)) {
                            if (x > max) {
                                max = x;
                            }
                        }else{

                        }

                    }
                    if (max != -1) {
                        move =  max;
                        if (move > 100) {
                            move = 100;
                        }
                        count++;
                    }
                }
            }

            System.out.println(count);
            t--;
        }

    }

}

