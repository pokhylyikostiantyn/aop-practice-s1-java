package homework.h02;

// https://leetcode.com/problems/add-digits/
public class T1 {
    public int addDigits(int num) {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
}
