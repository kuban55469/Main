package Task6;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        /*Напишите класс, который принимает с клавиатуры целое
        положительное число любой длины, а затем выводит его первую
        цифру*/


        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int counter = 0;
        if (num > 0){
            System.out.println(Math.max(num,counter));
        }
    }
}
