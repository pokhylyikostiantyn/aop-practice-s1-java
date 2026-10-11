package homework.h04;

// base
// https://leetcode.com/problems/plus-one/
public class T1 {}
class Solution {
    public int hammingDistance(int x, int y) {
        int diff = x ^ y;
        int count = 0;
        while (diff != 0) {
            diff &= (diff - 1); // clears the lowest set bit
            count++;
        }
        return count;
    }
}