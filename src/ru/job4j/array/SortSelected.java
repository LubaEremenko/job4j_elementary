package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; index++) {
            int min = MinDiapason.findMin(data, index, data.length - 1);
            int indexOfMin = FindLoop.indexOf(data, min, index, data.length - 1);
            int temp = data[indexOfMin];
            data[indexOfMin] = data[index];
            data[index] = temp;
        }
        return data;

    }

    public static void main(String[] args) {
       int[] data = new int[] {3, 4, 1, 2, 5};
       SortSelected.sort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
            }

        }

    }
