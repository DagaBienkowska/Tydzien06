package Sort;

import java.util.Arrays;

public class BubbleSortZadania {
    public static void main(String[] args) {
        int[] array1 = {4,2,9,8,5};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(switchElements(array1, 2, 4)));
        withIndex(array1);
        System.out.println();
        printArray(array1);
        System.out.println();
        printAndSwap(array1);
    }
    public static int[] switchElements(int[] input, int index1, int index2){
        int temp = input[index2];
        input[index2] = input[index1];
        input[index1] = temp;

        return input;
    }

    public static void withIndex(int[] input){
        for (int i = 0; i < input.length; i++){
            System.out.print(i + ":" + input[i] +" ");
        }
        System.out.println();
    }

    public static void printArray(int[] input){
        for (int i = 0; i < input.length; i++){
            withIndex(input);
        }
    }

    public static void printAndSwap(int[] input){
        withIndex(input);
        for (int i = 0; i < input.length - 1; i++){
           switchElements(input, i, i+1);
           withIndex(input);
        }
    }
}
