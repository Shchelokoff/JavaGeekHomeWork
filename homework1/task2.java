// Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {
        System.out.println("Простые числа:");
        for (int number = 1; number <= 1000; number++) {
            if (isSimple(number)) {
                System.out.printf("%d ", number);
            }
        }
    }

    public static boolean isSimple(int number) {
        for (int ind = 2; ind < number; ind++) {
            if (number % ind == 0) {
                return false;
            }
        }
        return true;
    }
}
