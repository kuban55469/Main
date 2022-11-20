package Task7;



import jdk.jfr.internal.consumer.RecordingInput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*7. Напишите класс, который принимает с клавиатуры целое число
        любой длины и строит из него число с обратным порядком цифр.
        Новое значение следует вывести в консоль.*/

        //ЗДЕЛАНО!!!!

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        int rev = 0;
        int count = String.valueOf(number).length();
        for (int i = 0; i < count; i++) {
            int digit = number % 10;
            rev = rev * 10+digit;
            number = number/10;
        }
        System.out.println("В обратном порядке: " + rev);
    }
}
