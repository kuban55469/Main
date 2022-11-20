package Task18;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*18. Напишите возвращающий метод типа массива int, который в
        параметры принимает массив и возвращает новый массив
        состоящий только из четных элементов массива А.*/


        //ЗДЕЛАНО!!!


        Random rd = new Random();
        int [] array = new int[20];
        System.out.print("Оригинал: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(1,100);
            System.out.print(array[i] + " ");
        }

        System.out.println("\nЧетные числа: ");
        getArray(array);
        System.out.println();
        System.out.println("НЕ Четные числа: ");
        getArray2(array);

    }
    public static void getArray(int [] array){
        for (int j : array) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
    }
    public static void getArray2(int [] array){

        for (int j : array) {
            if (j % 2 == 1) {
                System.out.print(j + " ");
            }
        }
    }
}
