package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Напишите класс, который принимает с консоли для переменной X
        целое положительное число, а затем дополнительно будет
        спрашивать ещё числа, эти числа будут должны вычитаться из
        переменной x, вы будете вводить числа до тех пор пока X не будет
        отрицательным или равен 0*/

        //ВЫПОЛНЕНО

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = sc.nextInt();
        int counter1, counter2;
        counter1 = number1-number2;
        System.out.println("Вычитание равно: " + counter1);
            while (counter1 > 0){
            System.out.print("Введите еще число: ");
            int number3 = sc.nextInt();
            counter2 = counter1 - number3;
            System.out.println("Вычитание равно: " + counter2);
            counter1 -= number3;
            if (counter1 <= 0){
                System.out.println("Вы перешли ноля!!!");
            }
        }

    }
}
