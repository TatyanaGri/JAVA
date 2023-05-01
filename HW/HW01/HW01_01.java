/**
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
 */
package HW.HW01;

import java.util.Scanner;

public class HW01_01 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", Number(i));
        iScanner.close();
    }

    public static int Number(int x) {
        return (x * (x + 1)) / 2;
    }
}
