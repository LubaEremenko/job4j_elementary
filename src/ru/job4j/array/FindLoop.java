package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
                int[] data = new int[5];
                int rsl = -1;
        for (int index = 0; index < data.length; index++) {
            if(data[index] == el) {
                rsl = index;
                break;
            }
            
        }
        return rsl;
        System.out.println(data(rsl));
        FindLoop.indexOf(5, 3);
    }

    public static void main(String[] args) {
       int rsl;
        int[] data = new int[] {6, 6, 8, 9, 3};
        FindLoop.indexOf(5, 3);
        System.out.println(data(rsl));

    }
}
