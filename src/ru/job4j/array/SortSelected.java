package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index <= data.length - 1; index++) {
            int min = MinDiapason.findMin(data, index, data.length - 1);
            int indexOfMin = FindLoop.indexOf(data, min, index, data.length - 1);
            int temp = data[min];
            data[min] = data[indexOfMin];
            data[indexOfMin] = temp;
        }
        return data;

    }

    public static void main(String[] args) {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        System.out.println(result);

    }
}
