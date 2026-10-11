package homework.h04;

// base
// https://leetcode.com/problems/hamming-distance/
class Solution1 {
    public int hammingDistance(int x, int y) {
        int diff = x ^ y;
        int count = 0;
        while (diff != 0) {
            diff &= (diff - 1);
            count++;
        }
        return count;
    }
}