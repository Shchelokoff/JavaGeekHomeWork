/*Реализуйте алгоритм сортировки пузырьком числового массива, 
результат после каждой итерации запишите в лог-файл.*/

import java.io.IOException;
import java.util.Random;
import java.util.logging.*;
public class task2 {
/*Метод сосздания массива случайных чисел*/
    public static int[] randomArr() {
        Random rand = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
/*Сортировка пузырьком*/
    public static int[] listSort(int [] arr){
        for(int k = 0; k < arr.length-1; k++) {
            
            for (int i = 0; i < arr.length - k-1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
/*Прописываем логирование*/
        Logger logger = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("logTask2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Info Bubble-Sort Array");
        logger.warning("Warning Bubble-Sort Array");
/*Входные данные для сортировки пузырьком*/
        System.out.printf("\nНеотсортированный массив: \n");
        int [] array = randomArr();
        lib.printArrayInt(array);
        System.out.printf("\nОтсортированный массив: \n");
        int[] newArr = listSort(array);
        lib.printArrayInt(newArr);
    }
}