package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length - 1; index++) {
            int min = MinDiapason.findMin(data, index, data.length);
            int indexOfMin = FindLoop.indexOf(data, min, index, data.length);
            int temp = data[indexOfMin];
            data[indexOfMin] = data[min];
            data[min] = temp;
        }
        return data;

    }

    public static void main(String[] args) {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        System.out.println(result);

    }
}
