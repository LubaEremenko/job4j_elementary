package ru.job4j.array;

public class ArrayChar {
    public static boolean startWith(char[] word, char[] pref) {
        boolean result = true;

        for (int index = 0; index < pref.length - 1; index++) {
            if (pref[index] == word[index]) {
                result = true;

            } else {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] word = new char[] {'h', 'e', 'l', 'l', 'o'};
        char[] pref = new char[] {'h', 'e'};
        boolean result = ArrayChar.startWith(word, pref);
        System.out.println(result);

    }
}
