package homework.h09;

import java.util.ArrayList;
import java.util.List;

public class T2 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int c : candies) {
            if (c > max) max = c;
        }

        List<Boolean> result = new ArrayList<>();
        for (int c : candies) {
            result.add(c + extraCandies >= max);
        }
        return result;
    }

    public static void main(String[] args) {
        T2 t = new T2();
        System.out.println(t.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3)); // [true, true, true, false, true]
        System.out.println(t.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1)); // [true, false, false, false, false]
        System.out.println(t.kidsWithCandies(new int[]{12, 1, 12}, 10));    // [true, false, true]
    }
}
