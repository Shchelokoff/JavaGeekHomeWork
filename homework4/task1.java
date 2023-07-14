/* Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.*/

package homework4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class task1 {

    public static LinkedList<Integer> reverse(LinkedList<Integer> ls) {
        LinkedList<Integer> revList = new LinkedList<>();
        for(int i= ls.size() - 1; i >= 0; i--) {
            revList.add(ls.get(i));
        }
        return revList;
    } 

    public static List<Integer> getRandomList(int size) {
        Random random = new Random();
        List<Integer> randomList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(100));
        }
        System.out.println(randomList);
        return randomList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(getRandomList(10));
        System.out.println(reverse(list));
    }
}