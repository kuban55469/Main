package Task24;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*24. Напишите метод возвращающий тип boolean , который
        принимает в качестве параметра массив целых чисел и проверяет,
        являются ли все элементы массива положительными числами.
        Если все элементы положительные то вернуть true, в других случая
        вернуть false.*/

        //ЗДЕЛАНО!!!

        Random rd = new Random();
        int [] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(0,20);

        }

        System.out.println(getTrue(array));

    }
    public static boolean getTrue(int [] array){
        for (int j : array) {
            if (j > 0) {
                return true;
            }
        }
        return false;
    }
}
