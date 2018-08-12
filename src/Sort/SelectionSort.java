package Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {34,65,23,98,12,32,90,67};
        minEle(array);
        System.out.println("Min od indexu a do indexu b");
        minEleFromIndex(array,  3, 1);
        System.out.println("Sortowanie od najmniejszego elementu");
        int[] array2 = {34,65,23,98,12,32,90,67};
        selectionSort(array2);
        System.out.println(Arrays.toString(array2));

    }

    public static void minEle(int[] input){
        int min = input[0];
        int index = 0;
        for (int i = 0; i < input.length-1; i++){
            if (min > input[i]){
                min = input[i];
                index = i;
            } else {
                continue;
            }
        }
        System.out.println(min + ":" + index);
    }

    public static void minEleFromIndex (int[] input, int index1, int index2){
        if (index1 > index2){
            int temp = index2;
            index2 = index1;
            index1 = temp;
        }
        int min = input[index1];
        int index = index1;
        for (int i = index1; i < index2; i++){
            if (min > input[i]){
                min = input[i];
                index = i;
            } else {
                continue;
            }
        }
        System.out.println(min + ":" + index);
    }

    public static int[] selectionSort(int[] input){
        for (int i = 0; i < input.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < input.length; j++){
                if (input[j] < input[min]){
                    min = j;
                }
            }
            int temp = input[min];
            input[min] = input[i];
            input[i] = temp;
        }
        return input;
    }
}
