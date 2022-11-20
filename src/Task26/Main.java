package Task26;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /* 26. Напишите возвращающий метод типа boolean, который в
        качестве параметра берет массив из положительных чисел.
        Если в массиве всего 5 чисел равных 2, то вывести true, а в
        остальных случая false. */
        Random rd = new Random();

        int [] array = {1,2,3,4,5,6,7,8,9,2,2,2,2};

        System.out.println(myMethod(array));

    }
    public static boolean myMethod(int [] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 10){
                return true;
            }
        }
        return false;
    }
}
