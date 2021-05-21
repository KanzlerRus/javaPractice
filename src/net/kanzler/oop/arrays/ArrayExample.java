package net.kanzler.oop.arrays;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
//        Увеличиваем размер массива на 1 и заносим новые данные
//        example1();

//        Переда с помощью int ...arr
//        example2();

//        Копирование массиов
//        example3();

//        Неравномерные массивы
//        example4();

    }

    private static void example4() {
        int[][] arr = {
                {1, 2, 3},
                {1, 2, 3, 4},
                {1, 2, 3, 4, 5}
        };

        for (int i = 0; i < arr.length; i++) {
            int[] inner = arr[i];
            for (int j = 0; j < inner.length; j++) {
                System.out.print(inner[j] + " ");
            }
            System.out.println();
        }

    }

    private static void example3() {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[4];
        arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(Arrays.toString(arr2));
    }

    private static void example1() {
        int[] array = {1, 2, 3, 4};
        int[] array2 = arrayPlusOne(array);
        array2[4] = 5;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }

    private static void example2() {
        printArray(1, 2, 3, 4, 5);
    }

    private static void printArray(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int[] arrayPlusOne(int[] array) {
        int[] array2 = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        return array2;
    }
}
