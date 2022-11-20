package Task12;

public class Main {
    public static void main(String[] args) {
        /*Создайте не возвращающий метод в параметры которого, вы
даете массив из целых чисел и еще целое число n.
Метод должен проверить есть ли в массиве число большее или
равное n.
Если есть такое число вывести в консоль true, в другом случае false!*/


        //ЗДЕЛАНО!!!


        int [] array = {656,556,644,848,846,856,895,645};
        myMethod(array,456);

    }
    public static void myMethod(int[] array, int num){
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println(num);

        for (int i = 0; i < array.length; i++) {
            if (array.length <= num){
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
            break;
        }
    }
}
