package homework.h03;

public class T2 {
    public int differenceOfSums(int n, int m) {
        int total = n * (n + 1) / 2;
        int k = n / m;
        int div = m * k * (k + 1) / 2;
        return total - 2 * div;
    }

    public static void main(String[] args) {
        T2 t = new T2();
        System.out.println(t.differenceOfSums(10, 3)); // 19
        System.out.println(t.differenceOfSums(5, 6));  // 15
        System.out.println(t.differenceOfSums(5, 1));  // -15
    }
}
