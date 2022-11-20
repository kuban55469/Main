package Task5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        /*Напишите класс, который принимает с клавиатуры целое число
        любой длины и выводит на экран:
        ● в первой строке - все четные цифры этого числа, через пробел
        ● во второй строке - все нечетные цифры этого числа, через
        пробел
        Например, для числа 765873 в первой строке будет выведены числа
        6 8, а во второй строке 7 5 7 3*/

        //ЗДЕЛАНО

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        chet(num);
        System.out.println();
        nechet(num);
    }
    public static void chet(int num){
        int rev = 0, nechet = 0, counter2 = String.valueOf(num).length();
        for (int i = 0; i < counter2; i++) {
            int dict = num % 10;
            if (dict % 2 == 1) {
                nechet = dict;
                System.out.print(nechet +" ");
            }
            rev = rev * 10 + dict;
            num = num / 10;
        }
    }
    public static void nechet(int num){
        int rev = 0, chet = 0, counter2 = String.valueOf(num).length();
        for (int i = 0; i < counter2; i++) {
            int dict = num % 10;
            if (dict %2 != 1){
                chet = dict;
                System.out.print(chet +" ");
            }
            rev = rev * 10 + dict;
            num = num / 10;
        }
    }
}
