/*К калькулятору из предыдущего ДЗ добавить логирование.*/

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;
public class task3 {
/*Тело калькулятора*/
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
    public static void main(String[] args) throws IOException {
/*Прописываем логирование*/
        Logger logger = Logger.getLogger(task3.class.getName());
        FileHandler fh = new FileHandler("logTask3.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Calculating has done");
/*Запроса ввода из консоли*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double firstArg = scan.nextDouble();
        System.out.print("\nКакое действие нужно выполнить? Введите знак( + - * / ): ");
        String action = scan.next();
        System.out.print("\nВведите второе число: ");
        double secondArg = scan.nextDouble();
        scan.close();
 /*Выдаст название ошибки, если ввёл в калькулятор некорректные значения*/   
        try {
            calculator(firstArg, secondArg, action);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}