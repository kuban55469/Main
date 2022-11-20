package Task10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*10. Напишите класс, который заполняет случайными двузначными
        числами массив, размер которого вводится с клавиатуры.
        После заполнения класс должен вывести на экран значения
        массива следующим образом:
        ● в первой строке - первую половину массива
        ● во второй строке - вторую половину массива*/

        //ВЫПОЛНЕНО

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Введите размер массива: ");
        int [] arrays = new int[sc.nextInt()];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = rd.nextInt(10,99);
        }
        System.out.println("Оригинал: " + Arrays.toString(arrays));
        int [] arrays2 = Arrays.copyOfRange(arrays,0,arrays.length/2);
        System.out.println("Биринчи жарымы: " + Arrays.toString(arrays2 ));
        int [] arrays3 = Arrays.copyOfRange(arrays,arrays.length/2,arrays.length);
        System.out.println("Экинчи жарымы: " + Arrays.toString(arrays3));


    }
}
