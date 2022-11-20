package Task9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        /*Напишите класс, который заполняет случайными
четырехзначными числами массив, размер которого вводится с
клавиатуры.
После заполнения класс должен вывести на экран значения
массива в одной строке, начиная с конца массива ( с последнего
индекса).*/

        //ЗДЕЛАНО

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Введите размер массива: ");
        Integer [] arrays = new Integer[sc.nextInt()];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = rd.nextInt(1000,9999);
            System.out.print(arrays[i] + " ");
        }
        System.out.println();
        Arrays.sort(arrays, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arrays));

        numbers();
    }

    public static void numbers(){
        System.out.println();
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Введите размер массива: ");
        int [] arrays = new int [sc.nextInt()];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = rd.nextInt(1000,9999);
            System.out.print(arrays[i] + " ");
        }
        System.out.println();
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));


    }

}