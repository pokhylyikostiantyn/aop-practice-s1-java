package homework.h12;

public class Solution {
    public int heightChecker(int[] heights) {
        int[] count = new int[101];
        for (int h : heights) {
            count[h]++;
        }

        int mismatches = 0;
        int current = 1;
        for (int h : heights) {
            while (count[current] == 0) {
                current++;
            }
            if (h != current) {
                mismatches++;
            }
            count[current]--;
        }
        return mismatches;
    }
}

