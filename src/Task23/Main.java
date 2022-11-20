package Task23;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*23. Напишите возвращающий метод типа массива int[] который
        берет в параметр число n, мы внутри метода создадим массив int[]
        размером n.
        Нам нужно сгенерировать рандомные числа массиву так чтобы
        каждое следующее число было больше предыдущей.*/
        Random rd = new Random();
        int n = 5;

        getArray(n);
    }



    public static void getArray(int n){
        Random rd = new Random();
        int b = rd.nextInt(5,1000);
        int k = 0;
        if (b == 0){
             k = b;
        }
         rd.nextInt(5,1000);
        int [] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            if (k > b) {
                b = k;
                array[i] = b;
                System.out.println(array[i]);
            }
        }
    }
}
