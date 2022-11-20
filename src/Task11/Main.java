package Task11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*11. Напишите класс, который заполняет случайными двузначными
        числами массив, размер которого вводится с клавиатуры.
        После заполнения класс должен вывести на экран значения
        массива следующим образом:
        ● в первой строке – четные значения, содержащиеся в массиве
        ● во второй строке – нечетные значения, содержащиеся в
        массиве*/

        //ЗДЕЛАНО!!!

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Введите размер массива: ");
        int [] array = new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(10,99);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int k : array) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
        }
        System.out.println();
        for (int j : array) {
            if (j % 2 == 1) {
                System.out.print(j + " ");
            }
        }
    }
}
