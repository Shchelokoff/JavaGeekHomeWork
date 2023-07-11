/*Пусть дан произвольный список целых чисел.
1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение */
package homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class task {
    public static List<Integer> getRandomList(int size) {
        Random random = new Random();
        List<Integer> randomList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(100));
        }
        return randomList;
    }

    public static void main(String[] args) {
        List<Integer> int_list = new ArrayList<Integer>();
        int_list = getRandomList(10);
        System.out.println(int_list);
        System.out.println(removeEvenValue(int_list));
        System.out.println(getMin(int_list));
        System.out.println(getMax(int_list));
        System.out.println(getAverage(int_list));

    }

    // Нужно удалить из него четные числа
    public static List<Integer> removeEvenValue(List<Integer> list) {
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        return list;
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min)
                min = list.get(i);
        }
        return min;
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max)
                max = list.get(i);
        }
        return max;
    }

    // Найти среднее значение
    public static Integer getAverage(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }
}
