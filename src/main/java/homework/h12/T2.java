package homework.h12;

public class Solution {
    private static final int MAX_VALUE = 1000;

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[MAX_VALUE + 1];
        for (int n : arr1) {
            count[n]++;
        }

        int[] result = new int[arr1.length];
        int index = 0;

        for (int n : arr2) {
            while (count[n] > 0) {
                result[index++] = n;
                count[n]--;
            }
        }

        for (int n = 0; n <= MAX_VALUE; n++) {
            while (count[n] > 0) {
                result[index++] = n;
                count[n]--;
            }
        }

        return result;
    }
}
