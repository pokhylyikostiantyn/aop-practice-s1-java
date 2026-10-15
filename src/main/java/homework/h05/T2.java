package homework.h05;

// advanced
// https://leetcode.com/problems/rotate-image/
public class T2 {}
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];
            if (l > r) {
                result[i] = l;
                left++;
            } else {
                result[i] = r;
                right--;
            }
        }
        return result;
    }
}