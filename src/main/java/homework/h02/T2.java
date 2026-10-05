
package homework.h02;

// https://leetcode.com/problems/add-digits/
public class T2 {
    public int addDigits(int num) {
        // Цифровой корень: сумма цифр не меняет остаток от деления на 9.
        // Для num > 0 результат лежит в диапазоне 1..9.
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
