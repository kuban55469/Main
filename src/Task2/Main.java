package Task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*2. Напишите класс, который генерирует 20 рандомных целых чисел
        из диапазона -50 до +50, и определяет наименьшее число и
        наибольшее число.*/

        //ВЫПОЛНЕНО

        Random random = new Random();
        int counter = 0;
        int counter2 = 0;
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(-50, 50);
            System.out.print(num + ", ");
            if (num > counter) {
                counter = num;
            }
            if (num < counter2) {
                counter2 = num;
            }
        }

        System.out.println("\nНаибольшое число равен: " + counter);
        System.out.println("Наименьшое число равен: " + counter2);
    }
}

