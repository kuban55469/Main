package Task25;

public class Main {
    public static void main(String[] args) {
        /*25. Дан массив состоящий из целых положительных чисел, и целое
        число n.
        Массив можно вручную заполнить (не сканнер), целое число n тоже
        можно дать вручную.
        Нужно найти с помощью суммы каких двух чисел массива мы можем
        получить число n, если есть такие числа нужно вернуть их индексы,
        если таких нет то вывести на экран таких нету.
        Пример: массив -> {2, 7, 11, 15, 45}, число n -> 9
        Нужно получить {0, 1} -> это индексы чисел с помощью суммы
        которых можно получить число n
        Пример: массив -> {3, 2, 4}, число n -> 6
        Нужно получить {1, 2} -> это индексы чисел с помощью суммы
        которых можно получить число n
        Пример: массив -> {3, 3}, число n -> 6
        Нужно получить {0, 1} -> это индексы чисел с помощью суммы
        которых можно получить число n
        Пример: массив -> {2, 7, 11, 15, 45}, число n -> 14
        Нужно получить -1   */

        int [] array = {1,3,5,7,9,2,4,6,8};
        int num = 10, counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] + array[i] == num){
                 counter += array[i];
                System.out.print(counter + " ");
            }
        }

    }
}
