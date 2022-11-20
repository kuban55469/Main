package Task29;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /* 29. Напишите возвращающий метод типа boolean, который в
        качестве параметра принимает наполненный положительными
        числами массив.
        Верните значение true, если один из первых 4 элементов в массиве
        равен 9. Длина массива может быть меньше 4. */

        Random rd = new Random();
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(1,99);
        }


    }


}
