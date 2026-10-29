package homework.h09;

import java.util.HashMap;
import java.util.Map;

public class T1 {

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int pairs = 0;
        for (int n : nums) {
            int seen = count.getOrDefault(n, 0);
            pairs += seen;
            count.put(n, seen + 1);
        }
        return pairs;
    }

    public static void main(String[] args) {
        T1 t = new T1();
        System.out.println(t.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3})); // 4
        System.out.println(t.numIdenticalPairs(new int[]{1, 1, 1, 1}));       // 6
        System.out.println(t.numIdenticalPairs(new int[]{1, 2, 3}));          // 0
    }
}
