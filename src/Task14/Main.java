package Task14;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*14. Напишите не возвращающий метод который в параметры берет
        массив из рандомных чисел от 1 до 50 и выводит в консоль только
        те числа что больше 20. */

        //ВЫПОЛНЕНО!!!!


        Random rd = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(1, 50);
        }
        getArray(array);
    }

    public static void getArray(int[] array) {
        System.out.println("Original: " + Arrays.toString(array));
        System.out.print("Числа которые больше 20: ");
        for (int j : array) {
            if (j >= 20) {
                System.out.print(j + " ");
            }
        }
    }
}
