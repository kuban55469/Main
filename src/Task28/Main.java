package Task28;

public class Main {
    public static void main(String[] args) {
        /* 28. Напишите возвращающий метод типа boolean, который в
        качестве параметров принимает массив целых чисел.
        Верните значение true, если последовательность чисел 1, 2, 3 где-то
        появляется в массиве. */
        int [] array = {1,4,7,9};
        System.out.println(getTrue(array));

    }
    public static boolean getTrue(int [] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i+1] <= array[i+1]){
                return true;
            }
        }
        return false;
    }
}
