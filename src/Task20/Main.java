package Task20;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*20. Напишите не возвращающий метод который получает в качестве
        параметра не заполненный массив с размером 15.
        Нужно массив заполнить положительными случайными
        двузначными четными числами.*/


        int[] array = new int[15];
        getArray(array);

    }
    public static void getArray(int[] array) {
        Random rd = new Random();

        for (int i = 0; i < array.length; i++) {
            int num = rd.nextInt(10,99);
            if (num %2 == 0) {
                array[i] = rd.nextInt(num);
                System.out.print(array[i] + " ");
            }
        }
    }
}
