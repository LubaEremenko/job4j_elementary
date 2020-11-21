package ru.job4j.array;

public class FindLoop {
        public static int indexOf(int[] data, int el) {
        int rsl = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rsl = index;
                break;
            }
            
        }
        return rsl;

    }

    public static void main(String[] args) {
           int[] data = new int[] {5, 1, 4, 6, 8};
           int rsl = FindLoop.indexOf(new int[]{5}, 4);
           System.out.println(rsl);

    }
}
