// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task1 {

    public static int Summ(int num) {
        int res = 0;
        for (int i = 1; i <= num; i++) {
            res += i;
        }
        return res;
    }

    public static int Fact(int num) {
        int res = 1;
        for (int ind = 0; ind < num; ind++) {
            res *= ind + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.printf("Введите число: ");
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        System.out.printf("Сумма чисел от 1 до %d: %d%n", n, Summ(n));
        System.out.printf("Произведение чисел от 1 до %d: %d%n", n, Fact(n));
        iScanner.close();
    }
}