package Task4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        /*Напишите класс, который принимает с клавиатуры две
        переменный это два числа, пока не будет введено две одинаковых
        чисел.
        Класс должен выводить на экран сумму всех первых чисел и сумму
        всех вторых чисел (не считая чисел, введенных одинаковыми).
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = sc.nextInt();
        int counter1 = 0, counter2 = 0, counter3 = 0;
        for (int i = counter1; i != counter2; i++) {
            if (num1 != num2) {
                System.out.print("Введите первое число: ");
                int number1 = sc.nextInt();
                counter1 += number1;
                System.out.print("Введите второе число: ");
                int number2 = sc.nextInt();
                counter2 += number2;
            }
        }
        counter1 +=num1;
        counter2 +=num2;
        System.out.println(counter1);
        System.out.println(counter2);

    }

}
