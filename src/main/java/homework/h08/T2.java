package homework.h08;

import java.util.List;

public class T2 {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        T2 s = new T2();
        System.out.println(s.countPairs(List.of(-1, 1, 2, 3, 1), 2));            // 3
        System.out.println(s.countPairs(List.of(-6, 2, 5, -2, -7, -1, 3), -2));  // 10
    }
}
