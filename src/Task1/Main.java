package Task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*1. Напишите класс, который создает 20 случайных чисел диапазона
        1 - 99. Следует вывести в консоль только те числа которые делятся
        на 1-ое рандомное число без остатка.*/

        //ЗДЕЛАНО!!

        Random rd = new Random();
        int numbers = 0, cjou=0;
        for (int j = 0; j < 20; j++) {
            numbers = rd.nextInt(1,99);
            if (j == 0) {
                cjou = numbers;
                System.out.println("\n" + cjou);
            }
            if (numbers%2==0) {
                System.out.print(numbers + " ");
            }
        }

    }
}
