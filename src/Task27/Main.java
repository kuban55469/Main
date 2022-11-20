package Task27;

public class Main {
    public static void main(String[] args) {
        /* 27. Напишите возвращающий метод типа String, который в качестве
        параметра берет String word и целое положительное число n.
        Нужно создать такой String в котором word будет повторяться n раз,
        и в конце надо этот String вернуть.
        Пример: “Hi”, 4 -> “HiHiHiHi”  */
        System.out.println(getWord("Hi",5));

    }
    public static String getWord(String word, int num){
        String word2 = null;
        for (int i = 0; i < 5; i++) {
            word2 += word;
            return word2;
        }
        return null;
    }
}
