package Sort;

import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        Integer[] array1 = {234, 45, 234, 67, 456, 23, 157, 59, 34, 135, 178, 655};
        System.out.println(Arrays.toString(array1));
        MergeSort(array1, 0, array1.length-1);
        System.out.println(Arrays.toString(array1));
    }


//
    private static Integer[] MergeSort(Integer[] input, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            MergeSort(input, left, mid);
            MergeSort(input, mid + 1, right);
            merge2(input, left, mid, right);
        }
        return input;
    }

    private static Integer[] merge2(Integer[] input, int left, int mid, int right){
        Integer[] temp = new Integer[input.length];
        int leftIndex = left;
        int rightIndex = mid + 1;

        for (int k = left; k <= right; k++){
            if (leftIndex > mid || (rightIndex <=right && input[rightIndex] < input[leftIndex])) {
                temp[k] = input[rightIndex];
                rightIndex++;
            } else {
                temp[k] = input[leftIndex];
                leftIndex++;
            }
        }

        for (int k = left; k <= right; k++){
            input[k] = temp[k];
        }
        return input;
    }
}

