package Task15;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*Напишите не возвращающий метод, который берет массив из
        рандомных чисел от 1 до 50 и еще одно целое число n.
        Нужно вывести в консоль сколько раз число n повторялось в
        массиве.*/


        //ЗДЕЛАНОО!!!

        Random rd = new Random();
        int[] array = new int[25];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(1, 50);
        }
        int n = rd.nextInt(1, 50);
        getArray(array, n);
    }

    public static void getArray(int[] array, int n) {
        System.out.println("Массив:" + Arrays.toString(array));
        System.out.println("Рандомное число: " + n);
        int counter = 0;
        for (int i1 = 0; i1 < array.length; i1++) {
            if (array[i1] == n) {
                counter++;
            }
        }
        System.out.println("Число " + n + " повторялось в массиве: " + counter + " раз!");
    }
}
