package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int nullIndex = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        int notNullIndex = j;
                        String temp = array[nullIndex];
                        array[nullIndex] = array[notNullIndex];
                        array[notNullIndex] = temp;
                    }
                    System.out.println(array[i] + " ");
                }

            }

        }
        return array;
    }


        public static void main (String[]args){
            String[] array = {"I", null, "wanna", null, "be", null, "compressed"};
            String[] compressed = compress(array);
            System.out.println();
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i] + " ");

            }
        }
    }

