import java.util.Random;

public class Main {
    public static void main(String[] args) {
                /* 30. Напишите возвращающий метод типа boolean, который в
        качестве параметра принимает наполненный положительными
        числами массив.
        Верните значение true, если в массиве встречаются 3 одинаковых
        числа подряд, в ином случае false.*/
        Random rd = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100, 1000);
            System.out.print(array[i] + " ");
        }
        System.out.println(getNum(array));


    }

    public static boolean getNum(int[] array) {
        boolean trueOrfalse = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= 3; i++) {
                if (array[1] == array[i]) {
                    return true;
                }
            }
        }
        return false;
    }

}