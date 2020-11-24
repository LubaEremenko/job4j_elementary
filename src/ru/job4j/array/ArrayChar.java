package ru.job4j.array;

public class ArrayChar {
    public static boolean startWith(char[] word, char[] pref) {
        boolean result = true;

        for (int index = 0; index < pref.length; index++) {
            if (pref[index] != word[index]) {
                result = false;

            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = new char[] {'h', 'e', 'l', 'l', 'o'};
        char[] pref = new char[] {'h', 'i'};
        boolean result = ArrayChar.startWith(word, pref);
        System.out.println(result);

    }
}
