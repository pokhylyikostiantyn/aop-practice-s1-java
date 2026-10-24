package homework.h07;

public class T2 {
    public int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        T2 s = new T2();
        System.out.println(s.numberOfSteps(14));  // 6
        System.out.println(s.numberOfSteps(8));   // 4
        System.out.println(s.numberOfSteps(123)); // 12
    }
}
