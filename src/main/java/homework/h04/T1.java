package homework.h05;

// base
// https://leetcode.com/problems/number-complement/
class Solution {
    public int findComplement(int num) {
        int mask = Integer.highestOneBit(num) - 1; // единицы на всех позициях ниже старшего бита
        return ~num & mask;
    }
}