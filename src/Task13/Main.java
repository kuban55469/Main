package Task13;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*Напишите не возвращающий метод, который берет в параметры
        массив из boolean типа, и выводит в консоль количество true
        элементов массива.*/

        //ЗДЕЛАНО!!!

        boolean [] b = new boolean[10];
        getMassive(b);
    }
    public static void getMassive(boolean [] b){
        Random random = new Random();
        int counter = 0;
        for (boolean b1 : b) {
            b1= random.nextBoolean();
            System.out.print(b1 + " ");
            if (b1 == (true)){
                counter++;
            }
        }
        System.out.println("\nКоличество true элементов: " +counter);
    }
}
