package Tydz07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Integer[] array = {3, 6, 7, 1, 9, 4, 21, 23, 65, 22, 69, 54, 98, 34, 2,9,3,6};
        System.out.println("Array: " +Arrays.toString(array));
        System.out.println("środkowy element: " +midElement(array));
        int random = 7;
        System.out.println("random: " + array[random]);
        System.out.println(Arrays.toString(bellowRandom(array, random)));
        System.out.println(Arrays.toString(aboweRandom(array, random)));
        System.out.println("\n");
        Integer[] array3 = quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array3));

    }

    public static Integer midElement(Integer[] input) {
        return input.length /2;
    }

    public static Integer randomElement(Integer[] input) {
        Random random = new Random();
        Integer randomElement = random.nextInt(input.length);
        return randomElement;
    }

    public static Integer[] bellowRandom(Integer[] input, int random) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i] < input[random]) {
                list.add(input[i]);
            }
        }
        Integer[] result = new Integer[list.size()];
        list.toArray(result);
        return result;
    }

    public static Integer[] aboweRandom(Integer[] input, int random) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i] >= input[random] && i != random) {
                list.add(input[i]);
            }
        }
        Integer[] result = new Integer[list.size()];
        list.toArray(result);
        return result;
    }

//    public static Integer[] sortedMerged(Integer[] input){
//
//
//    }

    public static Integer[] quickSort(Integer[] input, int left, int right){
        int mid = (left + right) / 2;
        int temp = 0;
        int j = left;
        int pivot = input[mid];
        input[mid] = input[right];
        for (int i = left; i <= right - 1; i++){
            if (input[i] < pivot){
                temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                j++;
            }
        }
        input[right] = input[j];
        input[j] = pivot;
        if (left < j - 1){
            quickSort(input, left, j - 1);
        }
        if (j + 1 < right){
            quickSort(input, j + 1, right);
        }
        return input;
    }
}
