import java.util.Scanner;

public class task3 {
    public static void calculator(double firstValue, double secondValue, String action) {
        double result;
        switch (action) {
            case "+":
                result = firstValue + secondValue;
                System.out.printf("Результат: %.2f", result);
                break;
            case "-":
                result = firstValue - secondValue;
                System.out.printf("Результат: %.2f", result);
                break;
            case "*":
                result = firstValue * secondValue;
                System.out.printf("Результат: %.2f", result);
                break;
            case "/":
                if (secondValue == 0) {
                    System.out.println("На ноль делить нельзя!");
                    break;
                }
                result = firstValue / secondValue;
                System.out.printf("Результат: %.2f", result);
                break;
            default:
                System.out.println("\nНекорректный ввод данных");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double firstArg = scan.nextDouble();
        System.out.print("\nКакое действие нужно выполнить? Введите знак( + - * / ): ");
        String action = scan.next();
        System.out.print("\nВведите второе число: ");
        double secondArg = scan.nextDouble();
        scan.close();
        try {
            calculator(firstArg, secondArg, action);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
