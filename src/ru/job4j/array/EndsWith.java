package ru.job4j.array;

public class EndsWith {
    public static boolean endWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (post[post.length - 1] != word[word.length - 1]) {
               result = false;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        char[] word = new char[] {'h', 'e', 'l', 'l', 'o'};
        char[] post = new char[] {'l', 'a'};
        boolean result = EndsWith.endWith(word, post);
        System.out.println(result);
    }

}
