package ru.job4j.array;

public class EndsWith {
    public static boolean endWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (post[post.length - index - 1] != word[word.length - index - 1]) {
               result = false;
               break;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        char[] word = new char[] {'h', 'e', 'l', 'l', 'o'};
        char[] post = new char[] {'l', 'o'};
        boolean result = EndsWith.endWith(word, post);
        System.out.println(result);
    }

}
