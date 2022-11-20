package Task19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*19. Напишите возвращающий метод типа String, который в качества
        параметра прнинимает число, и возвращает день недели как слово
        String.
        (Можно использовать switch or if else)*/

        //ЗДЕЛАНО!!!



        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число недели: ");
            int num = sc.nextInt();
            System.out.println(nameDays(num));
        }
    }
    public static String nameDays(int k){
        return switch (k) {
            case (1) -> "Понедельник";
            case (2) -> "Вторник";
            case (3) -> "Среда";
            case (4) -> "Четверг";
            case (5) -> "Пятница";
            case (6) -> "Суббота";
            case (7) -> "Воскресенье";
            default -> "Такого дня нет!!";
        };
    }
}
