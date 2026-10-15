package homework.h05;

public class T1 {
    public int maxProductDifference(int[] nums) {
        int max1 = 0, max2 = 0;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n > max1) {
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max2 = n;
            }

            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }

        return max1 * max2 - min1 * min2;
    }

    public static void main(String[] args) {
        T1 s = new T1();
        System.out.println(s.maxProductDifference(new int[]{5, 6, 2, 7, 4}));
        System.out.println(s.maxProductDifference(new int[]{4, 2, 5, 9, 7, 4, 8}));
    }
}