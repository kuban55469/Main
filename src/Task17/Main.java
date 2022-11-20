package Task17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*17. Напишите метод, который принимает в качестве параметра
        массив целых чисел и число К, число К это индекс в массиве.
        Нам нужно вывести сумму всех чисел до индекса K массива.*/

        //ЗДЕЛАНО!!!

        int [] arrays = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        getArray(arrays,10);
    }
    public static void getArray(int [] array, int k){
        System.out.println(Arrays.toString(array) + "\n" + "Найти сумму до: " + k + " индекса массива.");
        int counter = 0;
        for (int i = 0; i <= k; i++) {
            counter +=array[i];
        }
        System.out.println("Сумма всех индекесов: " + counter);
    }
}
