/* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. */

package homework4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    
// enqueue() - помещает элемент в конец очереди
public static void enqueue(Deque<Object> list) {
    Object element =  getRandomNumber();
    System.out.println("Очередь до добавления элемента в её конец: " + list);
    list.addLast(element);
    System.out.println("Очередь после добавления элемента в её конец: " + list);
    }

// dequeue() - возвращает первый элемент из очереди и удаляет его
    public static Object dequeue(Deque<Object> list) {
        System.out.println("Очередь до удаления элемента: " + list);
        Object item = list.pollFirst();
        System.out.println("Очередь после удаления элемента: " + list);
        return item;
    }

// first() - возвращает первый элемент из очереди, не удаляя
    public static Object first(Deque<Object> list) {
        return list.peekFirst();
    }

// Генерация очереди
    public static Deque<Object> getRandomList(int size) {
        Random random = new Random();
        Deque<Object> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }
// Генерация случайного числа
    public static int getRandomNumber() { 
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
// Основное тело программы
    public static void main(String[] args) {
        Deque<Object> list = new LinkedList<>(getRandomList(10));
        Deque<Object> list2 = list;
        while (true) {
            System.out.println("Ваша очередь (массив элементов): " + list2);
            System.out.println("Введиет номер операции: ");
            System.out.println("1 - поместить элемент в конец очереди");
            System.out.println("2 - вернуть первый элемент из очереди и удалить его");
            System.out.println("3 - вернуть первый элемент из очереди, не удаляя его");
            System.out.println("4 - завершение работы \n");
            Scanner sc = new Scanner(System.in);
            int cmd = sc.nextInt();
            if (cmd == 1) {
                enqueue(list2);
                System.out.println("\n");
                continue;
            }
            if (cmd == 2) {
                System.out.println("Ваш элемент: " + dequeue(list2));
                System.out.println("\n");
                continue;
            }
            if (cmd == 3) {
                System.out.println("Ваш элемент: " + first(list2));;
                System.out.println("\n");
                continue;
            }
            if (cmd == 4)
                break;
            sc.close();
        }
    }
}
