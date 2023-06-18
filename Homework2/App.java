//1. Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
//2. Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
//3. Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.

import java.util.Random;

public class App {
    public static void main(String[] args) {

        int[] arr = generateRandomArray(10);
        System.out.println("Исходный массив: ");
        printArray(arr);
        System.out.println("Количество чётных элементов: " + countEvens(arr));
        System.out.println("Разница между минимальным и максимальным элементом: "+getDifferenceBetweenMinMax(arr));
        System.out.println("Наличие повторяющихся нулей: "+hasAdjacentZeros(arr));



    }

    public static int[] generateRandomArray(int length) {
        int[] arr = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(6);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int countEvens(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int getDifferenceBetweenMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max - min;
    }

    public static boolean hasAdjacentZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
