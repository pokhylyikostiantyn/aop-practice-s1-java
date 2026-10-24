package homework.h08;

public class T1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;

        for (int n : nums) {
            if (n == 1) {
                current++;
                if (current > max) {
                    max = current;
                }
            } else {
                current = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        T1 s = new T1();
        System.out.println(s.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1})); // 3
        System.out.println(s.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1})); // 2
    }
}
