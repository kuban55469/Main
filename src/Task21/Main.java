package Task21;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*21. Напишите возвращающий метод типа массива char [], который в
        качестве параметра берет число n и boolean b.
        Число n означает количество букв для заполнения, если booelan b
        будет true, то нужно вернуть char[] массив состоящий из n заглавных
        букв, если же false то прописными буквами (маленькими).*/
        Random rd = new Random();
        int n = 5;
        boolean b = rd.nextBoolean();
        System.out.println(getStr(n, b));

    }
    public static char [] getStr(int n , boolean b){
        char ch = 'a';
        char cha = 'A';
        char [] symbol = new char[5];
        if (b == true){
            for (char c : symbol) {
                c = cha;
            }
        }
        return new char[cha];
    }
}
