package homework.h11;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class T1Test {
    private final T1 solution = new T1();

    @Test
    void example1() {
        assertThat(solution.missingNumber(new int[] {3, 0, 1})).isEqualTo(2);
    }

    @Test
    void example2() {
        assertThat(solution.missingNumber(new int[] {0, 1})).isEqualTo(2);
    }

    @Test
    void example3() {
        assertThat(solution.missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
    }

    @Test
    void singleElementZero() {
        assertThat(solution.missingNumber(new int[] {0})).isEqualTo(1);
    }

    @Test
    void singleElementOne() {
        assertThat(solution.missingNumber(new int[] {1})).isEqualTo(0);
    }

    @Test
    void missingZero() {
        assertThat(solution.missingNumber(new int[] {1, 2, 3})).isEqualTo(0);
    }
}
