package Task16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*16. Напишите метод возвращающий тип int, вы должны в параметры
        метода дать целое положительное число n.
        А метод нам вернёт сумму всех цифр от 0 до n.*/

        //ЗДЕЛАНО!!!

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        System.out.println("Равны: " + getNumbers(num));
    }
    public static int getNumbers(int n){
        System.out.println("Сумма всех чисел до: " + n);
        int counter = 0;
        for (int i = 0; i < n; i++) {
            counter +=i;
        }
        return counter;
    }
}
