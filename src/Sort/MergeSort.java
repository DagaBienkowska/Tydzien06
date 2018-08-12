package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] array1 = {234, 45, 234, 67, 456, 23, 157, 59, 34, 135, 178, 655};
        List<int[]> parts = divideArray(array1);
        System.out.println(Arrays.toString(parts.get(0)));
        System.out.println(Arrays.toString(parts.get(1)));
        int[] part1 = parts.get(0);
        int[] part2 = parts.get(1);
        int[] merged = mergeArrays(part1, part2);
        System.out.println("Połączone połówki: " + Arrays.toString(merged));
        int[] array2 = {3, 6, 2, 7};
        int[] array3 = {6, 4, 7, 3, 8, 9, 0};
        int[] merged2 = mergeArrays2(array2, array3);
        System.out.println("Połączone połówki: " + Arrays.toString(merged2));

    }

    public static List<int[]> divideArray(int[] input) {
        List<int[]> parts = new ArrayList<>();
        int[] part1 = new int[input.length / 2];
        int[] part2 = new int[input.length - part1.length];
        for (int i = 0; i < part1.length; i++) {
            part1[i] = input[i];
        }
        for (int i = 0; i < part2.length; i++) {
            part2[i] = input[part1.length + i];
        }
        parts.add(part1);
        parts.add(part2);
        return parts;
    }

    public static int[] mergeArrays(int[] input, int[] input2) {
        int[] merged = new int[input.length + input2.length];
        for (int i = 0; i < merged.length; i++) {
            if (i % 2 == 0) {
                merged[i] = input[i / 2];
            } else {
                merged[i] = input2[i / 2];
            }
        }
        return merged;
    }

    public static int[] mergeArrays2(int[] input, int[] input2) {
        int[] merged = new int[input.length + input2.length];
        for (int i = 0; i < merged.length; i++) {
            if (i % 2 == 0 && i < input.length*2) {
                merged[i] = input[i / 2];
            } else if (i > input.length*2){
                merged[i] = input2[i / 2+1];
            } else {
                merged[i] = input2[i / 2];
            }
        }
        return merged;
    }
}
